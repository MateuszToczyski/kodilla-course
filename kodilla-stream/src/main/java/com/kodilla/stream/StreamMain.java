package com.kodilla.stream;

import com.kodilla.stream.beautifier.*;
import com.kodilla.stream.iterate.*;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier beautifier = new PoemBeautifier();

        String rawText = "tHiS iS sOmE rAw tExT";

        String upperCase = beautifier.beautify(rawText, String::toUpperCase);
        String lowerCase = beautifier.beautify(rawText, String::toLowerCase);

        System.out.print(upperCase + ", " + lowerCase);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}