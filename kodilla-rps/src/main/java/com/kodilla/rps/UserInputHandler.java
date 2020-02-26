package com.kodilla.rps;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputHandler {

    private Scanner scanner;

    public UserInputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public String getUserName() {

        System.out.println("Enter your name:");
        String input = scanner.nextLine();

        while(input.length() > 20) {
            System.out.println("Name can't be longer than 20 characters. Enter valid name:");
            input = scanner.nextLine();
        }

        return input;
    }

    public int getTargetScoreFromInput() {

        boolean isInputValid = false;
        int targetScore = 0;

        while(!isInputValid) {

            System.out.println("Enter target score:");

            try {
                targetScore = Integer.parseInt(scanner.nextLine());
            } catch(Exception ex) {
                System.out.println("Value must be an integer.");
                continue;
            }

            if(targetScore > 0) {
                isInputValid = true;
            } else {
                System.out.println("Value must be greater than 0.");
            }
        }

        return targetScore;
    }

    public String getUserInput(String... validInputs) {

        String input = scanner.nextLine();

        while(! Arrays.asList(validInputs).contains(input)) {
            System.out.println("Invalid input! Enter new choice:");
            input = scanner.nextLine();
        }

        return input;
    }

    public boolean checkUserConfirmation(String message) {

        String input = "";

        System.out.println(message);

        input = scanner.nextLine();

        while(! input.equals("y") && ! input.equals("n")) {
            System.out.println("Incorrect input. Please enter correct value:");
            input = scanner.nextLine();
        }

        return input.equals("y");
    }
}
