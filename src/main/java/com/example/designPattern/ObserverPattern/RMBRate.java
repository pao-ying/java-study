package com.example.designPattern.ObserverPattern;

public class RMBRate extends Rate{
    @Override
    public void notifyAll(int number) {
        for (Company company: companies) {
            company.response(number);
        }
    }
}
