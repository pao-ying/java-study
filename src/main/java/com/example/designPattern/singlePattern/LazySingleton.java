package com.example.designPattern.singlePattern;

public class LazySingleton {
    private static volatile LazySingleton singleton = null;

    LazySingleton() {}

    public static LazySingleton getInstance() {
        if (singleton == null) {
            synchronized (LazySingleton.class) {
                if (singleton == null) {
                    singleton = new LazySingleton();
                }
            }
        }
        return singleton;
    }
}
