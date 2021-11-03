package com.example.designPattern.ObserverPattern;

public class ExportCompany implements Company{
    @Override
    public void response(int number) {
        if (number > 0) {
            System.out.println("降低了出口成本");
        } else {
            System.out.println("提高了出口成本");
        }
    }
}
