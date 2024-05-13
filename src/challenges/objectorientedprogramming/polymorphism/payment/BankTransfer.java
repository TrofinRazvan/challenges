package challenges.objectorientedprogramming.polymorphism.payment;

import challenges.objectorientedprogramming.polymorphism.Payment;

public class BankTransfer implements Payment {

    private String bankAccountNumber;

    public BankTransfer(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Bank Transfer payment of " + amount + " RON to bank account: " + bankAccountNumber);
    }
}