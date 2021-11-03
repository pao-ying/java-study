package com.example.www.IODemo;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

// 字符输出流
public class CharWriterDemo {
    // FileWriter
    public static void test1() throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Users\\23679\\Desktop\\项目\\0\\Java-Study\\src\\main\\java\\com.example.www.IODemo\\a.txt");
        fileWriter.write("something");
        fileWriter.close();
    }

    // OutputSteamWriter
    public static void test2() throws  IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("C:\\Users\\23679\\Desktop\\项目\\0\\Java-Study\\src\\main\\java\\com.example.www.IODemo\\a.txt"));
        outputStreamWriter.write("something");
        outputStreamWriter.close();
    }
}
