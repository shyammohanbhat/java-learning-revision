package com.revision.designpattern.decorator;

public class Main {
    public static void main(String[] args){
        Coffee c = new SimpleCoffee();
        c = new MilkDecorator(c);
        c = new SugarDecorator(c);

        System.out.println("Cost: "+c.cost());
        System.out.println("Description: "+c.display());
    }
}
