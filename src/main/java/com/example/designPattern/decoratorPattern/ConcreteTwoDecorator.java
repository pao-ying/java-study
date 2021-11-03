package com.example.designPattern.decoratorPattern;

public class ConcreteTwoDecorator extends Decorator{
    public ConcreteTwoDecorator(Component component) {
        super(component);
    }

    @Override
    public void show() {
        super.show();
        System.out.printf("%s", "2号增强！");
    }
}
