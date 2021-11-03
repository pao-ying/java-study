package com.example.designPattern.FactoryPattern;

public class CattleFactory implements AbstractAnimalFactory{
    @Override
    public Animal getAnimal() {
        return new Cattle();
    }
}
