package com.example.www.methodDemo;

public class valueChange {
    public static void main(String[] args) {
        String url = "";
//        StringBuffer url1 = "";
        Integer i1 = 100;
        Integer i2 = 200;
        swap(i1, i2);
        System.out.println(i1);
        System.out.println(i2);
    }

    public static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
        System.out.println(a.intValue());
        System.out.println(b);
    }
}
