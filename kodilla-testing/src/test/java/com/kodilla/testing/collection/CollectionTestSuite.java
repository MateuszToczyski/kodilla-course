package com.kodilla.testing.collection;

import org.junit.*;
import java.util.*;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test case begin...");
    }

    @After
    public void after() {
        System.out.println("Test case ended.");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        ArrayList<Integer> inputList = new ArrayList<>();
        ArrayList<Integer> correctOutputList = new ArrayList<>();
        ArrayList<Integer> actualOutputList = exterminator.exterminate(inputList);

        Assert.assertEquals(correctOutputList, actualOutputList);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        ArrayList<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> correctOutputList = new ArrayList<>(Arrays.asList(2, 4));
        ArrayList<Integer> actualOutputList = exterminator.exterminate(inputList);

        Assert.assertEquals(correctOutputList, actualOutputList);
    }
}
