package com.example.designPattern.decoratorPattern;

public class ConcreteOneComponent implements Component{
    @Override
    public void show() {
        System.out.println("Concrete1 show");
    }
}
