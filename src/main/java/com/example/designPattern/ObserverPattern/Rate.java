package com.example.designPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Rate {
    List<Company> companies = new ArrayList<>();

    public void add(Company company) {
        companies.add(company);
    }

    public void remove(Company company) {
        companies.remove(company);
    }

    public abstract void notifyAll(int number);
}
