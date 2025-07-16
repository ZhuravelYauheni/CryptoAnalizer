package ru.javarush.zhuravel.cryptoanalizer;

import java.util.Scanner;

public class Menu {

    private Menu () {}

    private static final String TITLE = "Это крипто-анализатор";
    private static final String NAVIGATE = "Для навигации по меню используйте цифровые клавиши (NumPad)";
    private static final String CASE_0 = "0 - Информация";
    private static final String CASE_1 = "1 - зашифровать текст с помощью ключа-значения";
    private static final String CASE_2 = "2 - расшифровать текст с помощью ключа-значения";
    private static final String CASE_3 = "3 - расшифровать текст методом brute force";
    private static final String CASE_4 = "4 - расшифровать текст методом статистического анализа";
    private static final String EXIT = "Для завершения программы введите \"exit\"";
    private static int menuShownCounter = 0;

    public static int showMenu() {
        if (menuShownCounter == 0) {
            System.out.println();
            System.out.println(TITLE);
            System.out.println(NAVIGATE);
        }
        System.out.println();
        System.out.println(CASE_0);
        System.out.println(CASE_1);
        System.out.println(CASE_2);
        System.out.println(CASE_3);
        System.out.println(CASE_4);
        System.out.println();
        System.out.println(EXIT);
        menuShownCounter++;



        return 1;
    }
}
