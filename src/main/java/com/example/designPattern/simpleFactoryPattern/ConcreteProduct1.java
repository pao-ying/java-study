package com.example.designPattern.simpleFactoryPattern;

public class ConcreteProduct1 implements Product{
    @Override
    public void show() {
        System.out.println("产品 1 展示");
    }
}
