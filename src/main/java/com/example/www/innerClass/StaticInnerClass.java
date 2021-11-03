package com.example.www.innerClass;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        System.out.println(outer2.getInnerA());
        Outer2.Inner2 inner2 = new Outer2.Inner2();
        System.out.println(inner2.getClass());
    }
}

class Outer2 {
    private static int a = 1;

    public int getInnerA() {
        return Inner2.a;
    }

    static class Inner2 {
        private static int a = 2;

        public static int getOuterA() {
            return Outer2.a;
        }
    }
}
