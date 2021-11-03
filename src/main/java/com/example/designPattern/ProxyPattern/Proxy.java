package com.example.designPattern.ProxyPattern;

public class Proxy implements Subject{
    private RealSubject subject;

    @Override
    public void request() {
        if (subject == null) {
            subject = new RealSubject();
        }
        preRequest();
        subject.request();
        postRequest();
    }

    public void preRequest() {
        System.out.println("访问方法前");
    }

    public void postRequest() {
        System.out.println("访问方法后");
    }
}
