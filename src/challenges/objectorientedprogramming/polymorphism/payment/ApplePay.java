package challenges.objectorientedprogramming.polymorphism.payment;

import challenges.objectorientedprogramming.polymorphism.Payment;

public class ApplePay implements Payment {

    private String appleAccountId;

    public ApplePay(String appleAccountId) {
        this.appleAccountId = appleAccountId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Apple Pay payment of " + amount + " RON from Apple account: " + appleAccountId);
    }
}