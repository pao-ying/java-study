package com.example.junitTestDemo.parameterTest;

public class PrimeNumberChecker {
    public boolean validate (int primeNumber) {
        for (int i = 2; i <= Math.sqrt(primeNumber); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
