package com.example.designPattern.simpleFactoryPattern;

public class Invoke {
    public static void main(String[] args) {
        Product product = SimpleFactory.getProduct(2);
        if (product != null) {
            product.show();
        }
    }
}
