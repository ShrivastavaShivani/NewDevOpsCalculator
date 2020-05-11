package com.devops;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.*;

import java.io.IOException;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() throws IOException {
        int a = 20;
        int b = 31;
        int expectedResult = 51;
        int result = calculator.add(a, b);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testSubtract() {
        int a = 25;
        int b = 20;
        int expectedResult = 5;
        long result = calculator.subtract(a, b);
        Assert.assertEquals(expectedResult, result);;
    }
}
