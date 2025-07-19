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

    public static List<String> encrypt(int direction, List<String> inputTextList, int key, Lang lang) {

        List<String> outputTextList = new ArrayList<String>();

        for (String inputText : inputTextList) {
            inputText.toLowerCase();
            StringBuilder encryptedLine = new StringBuilder();

            char[] charsInput = inputText.toCharArray();
            for (int i = 0; i < charsInput.length; i++) {

                if (lang == Lang.EN) {
                    for (int j = 0; j < EN_ALPHABET_LENGTH; j++) {
                        if (charsInput[i] == EN_ALPHABET_CHARS[j]) {
                            encryptedLine.append(EN_ALPHABET_CHARS[(j + key * direction) % EN_ALPHABET_LENGTH]);
                        }
                    }
                }
                else if (lang == Lang.RU) {
                    for (int j = 0; j < RU_ALPHABET_LENGTH; j++) {
                        if (charsInput[i] == RU_ALPHABET_CHARS[j]) {
                            encryptedLine.append(RU_ALPHABET_CHARS[(j + key * direction) % RU_ALPHABET_LENGTH]);
                        }
                    }
                }
            }

        outputTextList.add(encryptedLine.toString());
        }
        return outputTextList;
    }

    }


