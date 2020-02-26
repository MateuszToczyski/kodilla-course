package com.kodilla.rps;

import org.junit.*;
import org.mockito.Mockito;

public class RpsTestSuite {

    @Test
    public void testWinningGame() {

        CpuChoiceGenerator generatorMock = Mockito.mock(CpuChoiceGenerator.class);
        Mockito.when(generatorMock.generate()).thenReturn(1); //CPU always plays "rock"

        Game game = new Game(3, generatorMock);

        game.playRound(1); //play "rock"; score: player - 0, CPU - 0
        game.playRound(3); //play "scissors"; score: player - 0, CPU - 1
        game.playRound(2); //play "paper"; score: player - 1, CPU - 1
        game.playRound(2); //play "paper"; score: player - 2, CPU - 1
        game.playRound(2); //play "paper"; score: player - 3, CPU - 1

        Assert.assertTrue(game.isFinished());
        Assert.assertEquals("Player: 3, CPU: 1", game.getResult());
    }
}