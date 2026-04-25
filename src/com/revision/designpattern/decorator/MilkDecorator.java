package com.revision.designpattern.decorator;

//Concrete Decorator
public class MilkDecorator extends Decorator{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public int cost() {
        return coffee.cost() + 2;
    }

    @Override
    public String display() {
        return coffee.display()+", with Milk";
    }
}
