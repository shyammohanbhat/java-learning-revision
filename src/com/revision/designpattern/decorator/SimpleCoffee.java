package com.revision.designpattern.decorator;

//Concrete component
public class SimpleCoffee implements Coffee{
    @Override
    public int cost() {
        return 5;
    }

    @Override
    public String display() {
        return "Simple Coffee";
    }
}
