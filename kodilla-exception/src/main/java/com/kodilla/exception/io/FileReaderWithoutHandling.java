package com.kodilla.exception.io;

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class FileReaderWithoutHandling {

    public void readFile() throws IOException {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());
        Path path = Paths.get(file.getPath());

        Stream<String> fileLines = Files.lines(path);
        fileLines.forEach(System.out::println);
    }
}
