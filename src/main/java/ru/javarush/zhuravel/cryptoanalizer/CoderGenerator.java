package ru.javarush.zhuravel.cryptoanalizer;

import java.io.File;
import java.util.Scanner;

public class CoderGenerator {

    private static final String LANGUAGE_CHOICE = "Выберите язык";
    private static final String RU = "1 - русский";
    private static final String EN = "2 - английский";
    private static final String RETURN_BACK = "0 - вернуться назад";
    private static final String ENTER_KEY = "Введите ключ-значение";
    private static final String WRONG_KEY = "неверный ключ-значение для алфавита";
    private static final String PRINT_FILE_PATH = "Укажите путь к файлу в формате *.txt, который нужно зашифровать";



    private static void showCodeMenu() {
        System.out.println(LANGUAGE_CHOICE);
        System.out.println(RU);
        System.out.println(EN);
        System.out.println(RETURN_BACK);
    }

    public static void codeMenuNavigation(Scanner mainScanner, int direction) {
        showCodeMenu();

        while (true) {
            String input = mainScanner.nextLine(); // Используем переданный Scanner

            switch (input) {
                case "1":
                    System.out.println("в разработке");

                    break;
                case "2":
                    System.out.println("в разработке");
                    break;
                case "0":
                    return; // Просто выходим из метода
                default:
                    System.out.println(Menu.getWrongchoice());
            }
            showCodeMenu(); // Показываем меню снова
        }
    }
}
