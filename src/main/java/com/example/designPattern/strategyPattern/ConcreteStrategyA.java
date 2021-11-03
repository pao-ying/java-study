package com.example.designPattern.strategyPattern;

public class ConcreteStrategyA implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println("策略 A 被执行");
    }
}
