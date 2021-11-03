package com.example.junitTestDemo.simpleTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {TestMessageDemo.class,TestMessageDemo2.class}
)
public class TestSuite {
}
