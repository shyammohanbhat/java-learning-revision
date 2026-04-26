package com.revision.designpattern.strategy;

public class Main {
    public static void main(String[] args){
        PaymentStrategy card = new CardPayment();
        PaymentContext paymentContext = new PaymentContext(card);
        paymentContext.executePayment(100);

        //Change behaviour at runtime
        paymentContext = new PaymentContext(new UpiPayment());
        paymentContext.executePayment(200);
    }
}
