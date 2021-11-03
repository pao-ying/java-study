package com.example.designPattern.ProxyPattern;

public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("访问真是主题方法");
    }
}
