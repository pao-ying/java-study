package com.example.designPattern.decoratorPattern;

public class Invoke {
    public static void main(String[] args) {
        Component component = new ConcreteOneComponent();
        ConcreteOneDecorator decorator = new ConcreteOneDecorator(component);
        decorator.show();
    }
}
