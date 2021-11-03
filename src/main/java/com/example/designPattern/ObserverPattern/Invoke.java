package com.example.designPattern.ObserverPattern;

public class Invoke {
    public static void main(String[] args) {
        Rate rate = new RMBRate();
        rate.add(new ExportCompany());
        rate.add(new ImportCompany());
        rate.notifyAll(4);
    }
}
