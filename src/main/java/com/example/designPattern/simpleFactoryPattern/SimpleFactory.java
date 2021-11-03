package com.example.designPattern.simpleFactoryPattern;

public class SimpleFactory {
    static class ProductKind {
        static final int product_A = 1;
        static final int product_B = 2;
    }
    public static Product getProduct(int kind) {
        switch (kind) {
            case ProductKind.product_A:
                return new ConcreteProduct1();
            case ProductKind.product_B:
                return new ConcreteProduct2();
        }
        return null;
    }
}
