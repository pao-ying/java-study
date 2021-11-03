package com.example.www.genericsDemo;

public class Generic<T> {
    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public static void main(String[] args) {
        Generic<Integer> integerGeneric = new Generic<>(123456);
        System.out.println(integerGeneric.getKey());
    }
}
