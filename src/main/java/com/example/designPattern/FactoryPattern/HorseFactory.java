package com.example.designPattern.FactoryPattern;

public class HorseFactory implements AbstractAnimalFactory{
    @Override
    public Animal getAnimal() {
        return new Horse();
    }
}
