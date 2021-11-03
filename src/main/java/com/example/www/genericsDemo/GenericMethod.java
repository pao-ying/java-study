package com.example.www.genericsDemo;

public class GenericMethod {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"hello", "world"};
        printArray(intArray);
        printArray(stringArray);
    }
}
