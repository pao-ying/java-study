package com.example.SPI.javaSPI;

import java.util.ServiceLoader;

public class Invoke {
    public static void main(String[] args) {
        ServiceLoader<DemoInterface> serviceLoader = ServiceLoader.load(DemoInterface.class);
        for (DemoInterface interface1 : serviceLoader) {
            interface1.say();
        }
    }
}
