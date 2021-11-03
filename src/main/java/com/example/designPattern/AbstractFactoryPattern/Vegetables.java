package com.example.designPattern.AbstractFactoryPattern;

public class Vegetables implements Plant{
    @Override
    public void show() {
        System.out.println("生产蔬菜");
    }
}
