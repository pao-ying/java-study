package com.example.www.genericsDemo;

public class GeneratorImpl implements Generator<String>{
    @Override
    public String method() {
        return "hello";
    }

    public static void main(String[] args) {
        GeneratorImpl generator = new GeneratorImpl();
        System.out.println(generator.method());
    }
}
