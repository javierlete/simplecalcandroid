package com.example.simplecalc;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CalculatorTest {
    private Calculator mCalculator;

    @Before
    public void setUp(){
        mCalculator = new Calculator();
    }

    @Test
    public void addTwoNumbers() {
        double res = mCalculator.add(3.0, 4.0);
        assertEquals(7.0, res, 0.0005);
        res = mCalculator.add(3.0, -4.0);
        assertEquals(-1.0, res, 0.0005);
    }
}
