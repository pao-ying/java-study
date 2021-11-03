package com.example.designPattern.decoratorPattern;

public class ConcreteOneDecorator extends Decorator{
    public ConcreteOneDecorator(Component component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        System.out.printf("%s\n", "1号增强！");
    }
}
