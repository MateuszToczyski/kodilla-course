package com.kodilla.rps;

import java.util.*;

public class RpsRunner {

    public static void main(String[] args) {

        MAIN_LOOP: //Every iteration starts a new game. Breaks if user inputs "x".
        while(true) {

            System.out.println("Enter your name:");

            String username = new Scanner(System.in).nextLine();

            int targetScore = getTargetScoreFromInput();

            System.out.println("Hello " + username + "! Valid inputs: 1: rock, 2: paper, 3: scissors, n: new game, x: quit");

            Game game = new Game(targetScore);

            while(true) { //Every iteration starts a new turn. Breaks at the end of game.

                System.out.println("Enter your choice:");

                String input = getUserInput("1", "2", "3", "x", "n");

                if(input.equals("x")) {

                    if(checkUserConfirmation("Do you really want to quit? (y / n)")) {
                        break MAIN_LOOP;
                    }

                } else if(input.equals("n")) {

                    if(checkUserConfirmation("Do you want to start a new game? (y / n)")) {
                        continue MAIN_LOOP;
                    }

                } else {

                    game.playRound(Integer.parseInt(input));

                    if(game.isFinished()) {

                        System.out.println("Game finished with result:");
                        System.out.println(game.getResult());

                        System.out.println("\"n\" to play a new game, \"x\" to exit:");
                        input = getUserInput("x", "n");

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

    private static int getTargetScoreFromInput() {

        Scanner scanner = new Scanner(System.in);

        boolean isInputValid = false;
        int targetScore = 0;

        while(!isInputValid) {
            try {
                System.out.println("Enter target score:");
                targetScore = Integer.parseInt(scanner.nextLine());
                isInputValid = true;
            } catch(Exception ex) {
                System.out.println("Value must be an integer.");
            }
        }

        while(targetScore < 1) {
            System.out.println("Value must be greater than 0. Enter valid target score:");
            targetScore = Integer.parseInt(scanner.nextLine());
        }

        return targetScore;
    }

    private static String getUserInput(String... validInputs) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while(! Arrays.asList(validInputs).contains(input)) {
            System.out.println("Invalid input! Enter new choice:");
            input = scanner.nextLine();
        }

        return input;
    }

    private static boolean checkUserConfirmation(String message) {

        Scanner scanner = new Scanner(System.in);

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

class Game {

    private int targetScore;
    private int playerScore;
    private int cpuScore;
    private boolean finished;
    private Map<Integer, String> optionMap;

    public Game(int targetScore) {
        this.targetScore = targetScore;
        playerScore = 0;
        cpuScore = 0;
        finished = false;

        optionMap = new HashMap<>();
        optionMap.put(1, "rock");
        optionMap.put(2, "paper");
        optionMap.put(3, "scissors");
    }

    public boolean isFinished() {
        return finished;
    }

    public String getResult() {
        return "Player: " + playerScore + ", CPU: " + cpuScore;
    }

    public void playRound(int playerChoice) {

        int cpuChoice = generateCpuChoice();

        System.out.println("Your choice: " + optionMap.get(playerChoice) +
                           ", CPU choice: " + optionMap.get(cpuChoice));

        playerScore += calculateScore(playerChoice, cpuChoice);
        cpuScore += calculateScore(cpuChoice, playerChoice);

        System.out.println("Your current score: " + playerScore + ", CPU current score: " + cpuScore);

        if(playerScore == targetScore || cpuScore == targetScore) {
            finished = true;
        }
    }

    private int calculateScore(int choice, int opponentsChoice) {

        int score;

        if(choice == 1) {

            if(opponentsChoice == 1) {
                score = 0;
            } else if(opponentsChoice == 2) {
                score = 0;
            } else {
                score = 1;
            }

        } else if(choice == 2) {

            if(opponentsChoice == 1) {
                score = 1;
            } else if(opponentsChoice == 2) {
                score = 0;
            } else {
                score = 0;
            }

        } else {

            if(opponentsChoice == 1) {
                score = 0;
            } else if(opponentsChoice == 2) {
                score = 1;
            } else {
                score = 0;
            }
        }

        return score;
    }

    private int generateCpuChoice() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }
}
