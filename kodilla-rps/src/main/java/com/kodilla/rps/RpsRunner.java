package com.kodilla.rps;

public class RpsRunner {

    public static void main(String[] args) {

        UserInputHandler inputHandler = new UserInputHandler();
        CpuChoiceGenerator cpuChoiceGenerator = new CpuChoiceGenerator();

        GameFlowHandler gameFlowHandler = new GameFlowHandler();
        gameFlowHandler.run(inputHandler, cpuChoiceGenerator);
    }
}
