package com.kodilla.rps;

import org.junit.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Matchers.anyString;

public class RpsTestSuite {

    @Test
    public void testWinningScenario() {

        UserInputHandler inputHandlerMock = mock(UserInputHandler.class);

        when(inputHandlerMock.userNameFromInput()).thenReturn("Test user");
        when(inputHandlerMock.targetScoreFromInput()).thenReturn(3);
        when(inputHandlerMock.userInputWithLimitedChoice("1", "2", "3", "x", "n"))
                .thenReturn("1"); //user always chooses "rock"
        when(inputHandlerMock.userInputWithLimitedChoice("x", "n"))
                .thenReturn("x"); //user chooses to quit instead of starting a new game
        when(inputHandlerMock.checkUserConfirmation(anyString())).thenReturn(true); //user always confirms a choice

        CpuChoiceGenerator cpuChoiceGeneratorMock = mock(CpuChoiceGenerator.class);

        when(cpuChoiceGeneratorMock.generate()).thenReturn(3); //CPU always chooses "scissors"

        GameFlowHandler gameFlowHandler = new GameFlowHandler();

        gameFlowHandler.run(inputHandlerMock, cpuChoiceGeneratorMock);

        Assert.assertEquals(3, gameFlowHandler.getPlayerFinalScore());
        Assert.assertEquals(0, gameFlowHandler.getCpuFinalScore());
    }
}