package challenges.objectorientedprogramming.polymorphism;

public class CashPayment implements Payment{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cash payment of " + amount + " RON");
    }
}