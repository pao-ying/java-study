package com.example.www.ArrayListDemo;

import com.example.www.ArrayListDemo.entity.Person;

import java.util.ArrayList;

public class ArrayListDemoTest1 {
    public static void main(String[] args) {
        ArrayList<? extends Person> list = new ArrayList<>();
        list = new ArrayList<Person>();
//        list.add(new Person());
        list.toArray();
    }
}
