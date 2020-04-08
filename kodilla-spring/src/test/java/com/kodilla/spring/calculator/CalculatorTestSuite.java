package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator)context.getBean("calculator");

        double additionResult = calculator.add(5, 3);
        double subtractionResult = calculator.sub(10, 8);
        double multiplicationResult = calculator.mul(5, 4);
        double divisionResult = calculator.div(20, 5);

        Assert.assertEquals(8, additionResult, 0.00001);
        Assert.assertEquals(2, subtractionResult, 0.00001);
        Assert.assertEquals(20, multiplicationResult, 0.00001);
        Assert.assertEquals(4, divisionResult, 0.00001);
    }
}