package com.kodilla.exception.io;

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class FileReader {

    public void readFile() {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());
        Path path = Paths.get(file.getPath());

        try(Stream<String> fileLines = Files.lines(path)) {
            fileLines.forEach(System.out::println);
        } catch (IOException ex) {
            System.out.println("Something went wrong!");
        } finally {
            System.out.println("Operation completed!");
        }
    }
}
