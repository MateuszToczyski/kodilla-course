package com.kodilla.patterns2.aop.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Autowired private Calculator calculator;
    private static final Logger LOGGER = LoggerFactory.getLogger(CalculatorTestSuite.class);

    @Test
    public void testAdd() {
        assertEquals(25, calculator.add(10, 15), 0.0001);
    }

    @Test
    public void testSub() {
        assertEquals(-5, calculator.sub(10, 15), 0.0001);
    }

    @Test
    public void testMul() {
        assertEquals(150, calculator.mul(10, 15), 0.0001);
    }

    @Test
    public void testDiv() {
        assertEquals(3, calculator.div(15, 5), 0.0001);
    }

    @Test
    public void testFactorial() {
        BigDecimal result = calculator.factorial(new BigDecimal(1000));
        LOGGER.info("Testing factorial method");
        System.out.println(result);
        assertTrue(BigDecimal.ONE.compareTo(result) < 0);
    }
}