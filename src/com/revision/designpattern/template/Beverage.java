package com.revision.designpattern.template;

//Abstract class for defining template method
public abstract class Beverage {

    // Template method (final = fixed flow)
    public final void prepare() {
        boilWater();
        brew();        // variable
        pour();
        addCondiments(); // variable
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pour() {
        System.out.println("Pouring into cup");
    }

    abstract void brew();
    abstract void addCondiments();


}
