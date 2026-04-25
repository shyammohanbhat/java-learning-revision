package com.revision.designpattern.decorator;

//Concrete Decorator
public class SugarDecorator extends  Decorator{
    public SugarDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public int cost() {
        return coffee.cost()+1;
    }

    @Override
    public String display() {
        return coffee.display()+", with Sugar";
    }
}
