package com.example.designPattern.strategyPattern;

public class ConcreteStrategyB implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println("策略 B 被执行");
    }
}
