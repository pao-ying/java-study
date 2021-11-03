package com.example.designPattern.AbstractFactoryPattern;

public class MixOneFactory implements MixFactory{

    @Override
    public Animal getAnimal() {
        return new Horse();
    }

    @Override
    public Plant getPlant() {
        return new Fruit();
    }


}
