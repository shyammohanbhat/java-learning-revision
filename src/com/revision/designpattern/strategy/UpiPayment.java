package com.revision.designpattern.strategy;

//Concrete strategy
public class UpiPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paying amount through UPI: "+amount);
    }
}
