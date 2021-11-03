package com.example.www.innerClass;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.getInnerA());
        Outer.Inner inner = new Outer().new Inner();
        System.out.println(inner.getOuterA());
    }
}

class Outer {
    private static int a = 1;
    private Inner inner;

    Outer() {
        inner = new Inner();
    }

    public int getInnerA() {
        return inner.a;
    }

    class Inner {
        private int a = 2;

        public int getOuterA() {
            return Outer.a;
        }
    }
}
