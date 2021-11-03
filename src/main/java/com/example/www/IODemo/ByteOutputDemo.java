package com.example.www.IODemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

// 字符输出流
public class ByteOutputDemo {
    // FileOutputStream
    public static void test1() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\23679\\Desktop\\项目\\0\\Java-Study\\src\\main\\java\\com.example.www.IODemo\\a.txt");
        fileOutputStream.write("I like you".getBytes(StandardCharsets.UTF_8));
        fileOutputStream.close();
    }

    // BufferedOutputStream
    public static void test2() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\23679\\Desktop\\项目\\0\\Java-Study\\src\\main\\java\\com.example.www.IODemo\\a.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write("I like you".getBytes(StandardCharsets.UTF_8));
        fileOutputStream.close();
    }
}
