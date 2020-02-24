package com.kodilla.rps;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Game {

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

        if(choice == 1 && opponentsChoice == 3 ||
                choice == 2 && opponentsChoice == 1 ||
                choice == 3 && opponentsChoice == 2) {

            return 1;

        } else {
            return 0;
        }
    }

    private int generateCpuChoice() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }
}