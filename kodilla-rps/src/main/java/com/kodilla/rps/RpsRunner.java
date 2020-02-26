package com.kodilla.rps;

import java.util.*;

public class RpsRunner {

    public static void main(String[] args) {

        UserInputHandler inputHandler = new UserInputHandler(new Scanner(System.in));
        CpuChoiceGenerator generator = new CpuChoiceGenerator();

        GameFlowHandler gameFlowHandler = new GameFlowHandler();
        gameFlowHandler.run(inputHandler, generator);
    }
}
