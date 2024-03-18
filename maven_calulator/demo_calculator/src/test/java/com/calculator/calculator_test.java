package com.calculator;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

class calculatorTest {
    private calculator calc;
    
    @Before
    public void setUp() {
        calc = new calculator();
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testAdd() {
        float op1 = 10;
        float op2 = 5;
        float expresult = 25;
        float result = calc.addition(op1, op2);
        Assert.assertEquals(expresult, result);
    }
}