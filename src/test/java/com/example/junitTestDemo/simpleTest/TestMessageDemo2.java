package com.example.junitTestDemo.simpleTest;

import com.example.www.JunitTestDemo.MessageDemo;
import org.junit.Assert;
import org.junit.Test;

public class TestMessageDemo2 {
    private String message = "robert";
    private MessageDemo messageDemo = new MessageDemo(this.message);

    @Test
    public void testPrintMessage() {
        Assert.assertEquals(message, messageDemo.printMessage());
    }
}
