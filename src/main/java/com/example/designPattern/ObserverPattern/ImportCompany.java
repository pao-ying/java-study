package com.example.designPattern.ObserverPattern;

public class ImportCompany implements Company{
    @Override
    public void response(int number) {
        if (number > 0) {
            System.out.println("降低了进口成本");
        } else {
            System.out.println("提高了进口成本");
        }
    }
}
