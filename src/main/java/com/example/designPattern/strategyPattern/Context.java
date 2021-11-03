package com.example.designPattern.strategyPattern;

public class Context {
    private Strategy strategy;

    Context() {}

    Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }
}
