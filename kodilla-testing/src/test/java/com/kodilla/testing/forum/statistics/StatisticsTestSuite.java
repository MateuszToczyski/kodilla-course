package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StatisticsTestSuite {

    @Test
    public void testCalculateAdvStatistics_ZeroPosts() {

        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        when(statisticsMock.userNames()).thenReturn(new ArrayList<>(Arrays.asList("user1", "user2")));

        StatisticsCalculator calculator = new StatisticsCalculator();

        assertThrows(IllegalArgumentException.class, () -> calculator.calculateAdvStatistics(statisticsMock));
    }

    @Test
    public void testCalculateAdvStatistics_1000Posts() {

        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        when(statisticsMock.userNames()).thenReturn(new ArrayList<>(Arrays.asList("user1", "user2")));

        StatisticsCalculator calculator = new StatisticsCalculator();

        calculator.calculateAdvStatistics(statisticsMock);

        assertEquals(500, calculator.getAvgPostsPerUser(), 0.01);
        assertEquals(1000, calculator.getAvgCommentsPerUser(), 0.01);
        assertEquals(2, calculator.getAvgCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatistics_ZeroComments() {

        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.userNames()).thenReturn(new ArrayList<>(Arrays.asList("user1", "user2")));

        StatisticsCalculator calculator = new StatisticsCalculator();

        calculator.calculateAdvStatistics(statisticsMock);

        assertEquals(500, calculator.getAvgPostsPerUser(), 0.01);
        assertEquals(0, calculator.getAvgCommentsPerUser(), 0.01);
        assertEquals(0, calculator.getAvgCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatistics_MorePostsThanComments() {

        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
        when(statisticsMock.userNames()).thenReturn(new ArrayList<>(Arrays.asList("user1", "user2")));

        StatisticsCalculator calculator = new StatisticsCalculator();

        calculator.calculateAdvStatistics(statisticsMock);

        assertEquals(500, calculator.getAvgPostsPerUser(), 0.01);
        assertEquals(250, calculator.getAvgCommentsPerUser(), 0.01);
        assertEquals(0.5, calculator.getAvgCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatistics_ZeroUsers() {

        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        when(statisticsMock.userNames()).thenReturn(new ArrayList<>());

        StatisticsCalculator calculator = new StatisticsCalculator();

        assertThrows(IllegalArgumentException.class, () -> calculator.calculateAdvStatistics(statisticsMock));
    }

    @Test
    public void testCalculateAdvStatistics_100Users() {

        List<String> mockUserNames = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            mockUserNames.add("mockString");
        }

        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        when(statisticsMock.userNames()).thenReturn(mockUserNames);

        StatisticsCalculator calculator = new StatisticsCalculator();

        calculator.calculateAdvStatistics(statisticsMock);

        assertEquals(10, calculator.getAvgPostsPerUser(), 0.01);
        assertEquals(20, calculator.getAvgCommentsPerUser(), 0.01);
        assertEquals(2, calculator.getAvgCommentsPerPost(), 0.01);
    }
}



















































