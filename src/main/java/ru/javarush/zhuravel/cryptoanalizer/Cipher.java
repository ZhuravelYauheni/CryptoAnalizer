package ru.javarush.zhuravel.cryptoanalizer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cipher {

    private static final String EN_ALPHABET = "abcdefghijklmnopqrstuvwxyz.,!?:;\"'-() 0123456789";
    private static final char[] EN_ALPHABET_CHARS = EN_ALPHABET.toCharArray();
    private static final int EN_ALPHABET_LENGTH = EN_ALPHABET.length();
    private static final String RU_ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя.,!?:;\"'-() 0123456789";
    private static final char[] RU_ALPHABET_CHARS = RU_ALPHABET.toCharArray();
    private static final int RU_ALPHABET_LENGTH = RU_ALPHABET.length();

    int direction;
    List<String> input;
    List<String> output;
    int key;
    Lang lang;


    public static List<String> encrypt(int direction, List<String> inputTextList, int key, Lang lang) {
        List<String> outputTextList = new ArrayList<>();
        String alphabet = (lang == Lang.EN) ? EN_ALPHABET : RU_ALPHABET;
        int alphabetLength = alphabet.length();

        for (String inputText : inputTextList) {
            StringBuilder encryptedLine = new StringBuilder();
            for (char c : inputText.toCharArray()) {
                char lowerC = Character.toLowerCase(c);
                int index = alphabet.indexOf(lowerC);

                if (index != -1) {
                    int newIndex = (index + key * direction) % alphabetLength;
                    if (newIndex < 0) newIndex += alphabetLength;
                    char newChar = alphabet.charAt(newIndex);
                    encryptedLine.append(Character.isUpperCase(c) ? Character.toUpperCase(newChar) : newChar);
                } else {
                    encryptedLine.append(c);
                }
            }
            outputTextList.add(encryptedLine.toString());
        }
        return outputTextList;
    }

    }


