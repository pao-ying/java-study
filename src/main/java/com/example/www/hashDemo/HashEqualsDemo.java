package com.example.www.hashDemo;

import java.util.Objects;

public class HashEqualsDemo {
    private String name;

    public HashEqualsDemo(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashEqualsDemo that = (HashEqualsDemo) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "HashEqualsDemo{" +
                "name='" + name + '\'' +
                '}';
    }
}
