package challenges.ObjectOrientedProgramming.polymorphism.payment;

import challenges.ObjectOrientedProgramming.polymorphism.Payment;

public class GooglePay implements Payment {

    private String googleAccountId;

    public GooglePay(String googleAccountId) {
        this.googleAccountId = googleAccountId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Google Pay payment of " + amount + " RON from Google account: " + googleAccountId);
    }
}