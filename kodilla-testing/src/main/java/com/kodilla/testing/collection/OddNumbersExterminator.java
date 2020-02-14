package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> returnList = new ArrayList<>();

        for(int number : numbers) {
            if(number % 2 == 0) {
                returnList.add(number);
            }
        }

        return returnList;
    }
}
