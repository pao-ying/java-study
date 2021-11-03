package com.example.www.IODemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

// 字符输入流
public class ByteInputDemo {
    // FileInputStream
    public static void test1() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\23679\\Desktop\\项目\\0\\Java-Study\\src\\main\\java\\com.example.www.IODemo\\a.txt");
        byte[] bytes = new byte[5];
        int len;
        while ((len = fileInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        fileInputStream.close();
    }

    // BufferedInputStream
    public static void test2() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\23679\\Desktop\\项目\\0\\Java-Study\\src\\main\\java\\com.example.www.IODemo\\a.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        byte[] bytes = new byte[5];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        fileInputStream.close();
        bufferedInputStream.close();
    }



    public static void main(String[] args) throws IOException {
        test1();
        test2();
    }
}
