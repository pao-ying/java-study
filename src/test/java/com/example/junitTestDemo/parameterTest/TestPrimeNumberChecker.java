package com.example.junitTestDemo.parameterTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestPrimeNumberChecker {
    private int inputNumber;
    private boolean expectedResult;
    private PrimeNumberChecker primeNumberChecker;

    @Before
    public void init() {
        primeNumberChecker = new PrimeNumberChecker();
    }

    public TestPrimeNumberChecker(int inputNumber, boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                {2, true},
                {6, true},
                {19, true},
                {22, true}
        });
    }

    @Test
    public void testPrimeNumberCheck() {
        System.out.println("parameterized number is: " + inputNumber);
        Assert.assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
    }
}
