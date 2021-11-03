package com.example.www.StringTableDemo;

public class Test1 {
    public static void main(String[] args) {
        String s = new String("a") + new String("b");
        System.out.println(s.getClass());
        String s2 = s;
        String s1 = s.intern();
        System.out.println(s2 == s1);
    }
}
