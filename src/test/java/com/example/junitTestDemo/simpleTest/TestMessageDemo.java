package com.example.junitTestDemo.simpleTest;

import com.example.www.JunitTestDemo.MessageDemo;
import org.junit.Assert;
import org.junit.Test;

public class TestMessageDemo {
    private String message = "hello world";
    private MessageDemo messageDemo = new MessageDemo(this.message);

    @Test
    public void testPrintMessage() {
//        message = "no";
        Assert.assertEquals(message, messageDemo.printMessage());
    }
}
