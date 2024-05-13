package challenges.objectorientedprogramming.polymorphism.payment;

import challenges.objectorientedprogramming.polymorphism.Payment;

public class Main {

    public static void main(String[] args) {
        Payment googlePay = new GooglePay("mashallah@gmail.com");
        Payment applePay = new ApplePay("inshallah@icloud.com");
        Payment bankTransfer = new BankTransfer("1234567890");

        googlePay.processPayment(100.50);
        applePay.processPayment(50.25);
        bankTransfer.processPayment(75.75);
    }
}