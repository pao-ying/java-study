package com.example.designPattern.AbstractFactoryPattern;

public class MixTwoFactory implements MixFactory{
    @Override
    public Animal getAnimal() {
        return new Cattle();
    }

    @Override
    public Plant getPlant() {
        return new Vegetables();
    }
}
