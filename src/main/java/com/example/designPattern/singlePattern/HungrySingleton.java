package com.example.designPattern.singlePattern;

public class HungrySingleton {
    private static final HungrySingleton SINGLETON = new HungrySingleton();

    public HungrySingleton() {};

    public static HungrySingleton getInstance() {
        return SINGLETON;
    }
}
