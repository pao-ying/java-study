package com.example.designPattern.decoratorPattern;

public class Decorator implements Component{
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void show() {
        component.show();
    }
}
