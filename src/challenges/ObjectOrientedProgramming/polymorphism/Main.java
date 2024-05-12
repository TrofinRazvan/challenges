package challenges.ObjectOrientedProgramming.polymorphism;

public class Main {

    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment("1234 5678 9012 3456", "12/24", "123");
        Payment payPalPayment = new PayPalPayment("yalla@example.com", "password");
        Payment cashPayment = new CashPayment();

        creditCardPayment.processPayment(100.50);
        payPalPayment.processPayment(50.25);
        cashPayment.processPayment(75.75);
    }
}