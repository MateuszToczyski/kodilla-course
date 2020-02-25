package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String... args) {

        SecondChallenge challenge = new SecondChallenge();

        try {
            System.out.println(challenge.probablyIWillThrowException(10.0, 5.0));
        } catch(Exception ex) {
            System.out.println("An exception was thrown: " + ex);
        } finally {
            System.out.println("Operation completed!");
        }
    }
}
