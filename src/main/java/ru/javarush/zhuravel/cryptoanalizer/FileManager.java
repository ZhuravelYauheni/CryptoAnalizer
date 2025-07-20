package ru.javarush.zhuravel.cryptoanalizer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileManager {

    public static List<String> readFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }

    public static void writeFile(List<String> content, String filePath) throws IOException {
        Files.write(Paths.get(filePath), content);
    }
}