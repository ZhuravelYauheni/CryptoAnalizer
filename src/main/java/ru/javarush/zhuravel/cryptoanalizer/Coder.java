package ru.javarush.zhuravel.cryptoanalizer;

import java.util.Scanner;

public class Coder {
    private static final String EN_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz.,!?:;\"'-() 0123456789";
    private static final int EN_ALPHABET_LENGTH = EN_ALPHABET.length();
    private static final String RU_ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя.,!?:;\"'-() 0123456789";
    private static final int RU_ALPHABET_LENGTH = RU_ALPHABET.length();
    private int key;
    private static final String LANGUAGE_CHOICE = "Выберите язык";
    private static final String RU = "1 - русский";
    private static final String EN = "2 - английский";
    private static final String RETURN_BACK = "0 - вернуться назад";
    private static int codeMenuShownCounter;

    private static void showCodeMenu() {
        System.out.println(LANGUAGE_CHOICE);
        System.out.println(RU);
        System.out.println(EN);
        System.out.println(RETURN_BACK);
    }

    public static void codeMenuNavigation() {
        showCodeMenu();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Работа идёт над русским языком");
                    break;
                case "2":
                    System.out.println("Работа идёт над английским языком");
                    break;
                case "0":
                    scanner.close();
                    return;
                default:
                    System.out.println(Menu.getWrongchoice());
                    break;
            }
        }
    }





}
