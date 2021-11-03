package com.example.designPattern.strategyPattern;

public class Invoke {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyA();
        Context context = new Context();
        context.setStrategy(strategy);
        context.getStrategy().strategyMethod();
    }
}
