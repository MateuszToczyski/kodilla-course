package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args){

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if(result.equals("theForumUser")) {
            System.out.println("Name test OK");
        } else {
            System.out.println("Name test failure");
        }

        Calculator calculator = new Calculator();

        int addResult = calculator.add(5, 6);
        int subtractResult = calculator.subtract(10, 4);

        if(addResult == 11) {
            System.out.println("Adding test OK");
        } else {
            System.out.println("Adding test failure");
        }

        if(subtractResult == 6) {
            System.out.println("Subtracting test OK");
        } else {
            System.out.println("Subtracting test failure");
        }
    }
}