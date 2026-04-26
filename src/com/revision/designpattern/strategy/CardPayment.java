package com.revision.designpattern.strategy;

//Concrete strategy
public class CardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paying amount with Card: "+amount);
    }
}
