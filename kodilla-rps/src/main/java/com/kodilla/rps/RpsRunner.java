package com.kodilla.rps;

import java.util.*;

public class RpsRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserInputHandler inputHandler = new UserInputHandler(scanner);

        MAIN_LOOP: //Every iteration starts a new game. Breaks if user inputs "x".
        while(true) {

            System.out.println("Enter your name:");

            String username = inputHandler.nextLine();

            int targetScore = inputHandler.getTargetScoreFromInput();

            System.out.println("Hello " + username + "! Valid inputs: 1: rock, 2: paper, 3: scissors, n: new game, x: quit");

            Game game = new Game(targetScore);

            while(true) { //Every iteration starts a new turn. Breaks at the end of game.

                System.out.println("Enter your choice:");

                String input = inputHandler.getUserInput("1", "2", "3", "x", "n");

                if(input.equals("x")) {

                    if(inputHandler.checkUserConfirmation("Do you really want to quit? (y / n)")) {
                        break MAIN_LOOP;
                    }

                } else if(input.equals("n")) {

                    if(inputHandler.checkUserConfirmation("Do you want to start a new game? (y / n)")) {
                        continue MAIN_LOOP;
                    }

                } else {

                    game.playRound(Integer.parseInt(input));

                    if(game.isFinished()) {

                        System.out.println("Game finished with result:");
                        System.out.println(game.getResult());

                        System.out.println("\"n\" to play a new game, \"x\" to exit:");
                        input = inputHandler.getUserInput("x", "n");

                        if(input.equals("x")) {
                            break MAIN_LOOP;
                        } else {
                            continue MAIN_LOOP;
                        }
                    }
                }
            }
        }

        System.out.println("Program ended.");
    }
}
