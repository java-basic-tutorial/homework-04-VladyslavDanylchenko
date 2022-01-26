package com.softserveinc.task01;

public class CoffeeMachineV1 extends AbstractCoffeeMachine {

    public CoffeeMachineV1(int coffeeBeanStorageCapacity, int waterReservoirCapacity, int wasteCoffeeBeanCapacity) {
        super(coffeeBeanStorageCapacity, waterReservoirCapacity, wasteCoffeeBeanCapacity);
    }

    @Override
    public boolean makeEspresso() {
        int coffee = 22, water = 30;
        return makeCoffee(coffee, water);
    }

    @Override
    public boolean makeAmericano() {
        int coffee = 22, water = 100;
        return makeCoffee(coffee, water);
    }
}
