package com.example.www.IODemo;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

// 字符输入流
public class CharReadDemo {

    //FileReader
    public static void test1() throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\23679\\Desktop\\项目\\0\\Java-Study\\src\\main\\java\\com.example.www.IODemo\\a.txt");
        int ch;
        while ((ch = fileReader.read()) != -1) {
            System.out.println((char) ch);
        }
    }

    // InputStreamReader
    public static void test2() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("C:\\Users\\23679\\Desktop\\项目\\0\\Java-Study\\src\\main\\java\\com.example.www.IODemo\\a.txt"));
        int ch;
        while ((ch = inputStreamReader.read()) != -1) {
            System.out.println((char) ch);
        }
    }

    // BufferedReader
    public static void test3() throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\23679\\Desktop\\项目\\0\\Java-Study\\src\\main\\java\\com.example.www.IODemo\\a.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int ch;
        while ((ch = bufferedReader.read()) != -1) {
            System.out.println((char) ch);
        }
    }

    public static void main(String[] args) throws IOException {
        test1();
        BigDecimal b1 = new BigDecimal("1.00");
        BigDecimal b2 = new BigDecimal("1.0");
        System.out.println(b1.equals(b2));
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        String[] strings = new String[]{"dog", "cat", "fox"};
        List<String> list1 = Arrays.asList(strings);
        Collections.reverse(list1);
        String[] strings1 = (String[]) list.toArray();
//        Map
    }
}
