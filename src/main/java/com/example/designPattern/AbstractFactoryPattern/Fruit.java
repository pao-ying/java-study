package com.example.designPattern.AbstractFactoryPattern;

public class Fruit implements Plant{
    @Override
    public void show() {
        System.out.println("生产水果");
    }
}
