package com.kodilla.rps;

public class GameFlowHandler {

    public void run(UserInputHandler inputHandler, CpuChoiceGenerator cpuChoiceGenerator) {

        String username = inputHandler.getUserName();

        boolean playNextGame = true;

        while(playNextGame) {

            int targetScore = inputHandler.getTargetScoreFromInput();

            Game game = new Game(targetScore, cpuChoiceGenerator);

            System.out.println("Hello " + username +
                    "! Valid inputs: 1: rock, 2: paper, 3: scissors, n: new game, x: quit");

            boolean continueCurrentGame = true;

            while(continueCurrentGame) {

                System.out.println("Enter your choice:");
                String input = inputHandler.getUserInput("1", "2", "3", "x", "n");

                if(input.equals("x")) {

                    if(inputHandler.checkUserConfirmation("Do you really want to quit? (y / n)")) {
                        continueCurrentGame = false;
                        playNextGame = false;
                    }

                } else if(input.equals("n")) {

                    if(inputHandler.checkUserConfirmation("Do you want to start a new game? (y / n)")) {
                        continueCurrentGame = false;
                    }

                } else {

                    game.playRound(Integer.parseInt(input));

                    if(game.isFinished()) {

                        continueCurrentGame = false;

                        System.out.println("Game finished with result:");
                        System.out.println(game.getResult());

                        System.out.println("\"n\" to play a new game, \"x\" to exit:");
                        input = inputHandler.getUserInput("x", "n");

                        if(input.equals("x")) {
                            playNextGame = false;
                        }
                    }
                }
            }
        }
    }
}
