package challenges.oop.abstraction;

public class Motorcycle implements Vehicle {

    @Override
    public void start() {
        System.out.println("Motorcycle started at green colour.");
    }
    @Override
    public void stop() {
        System.out.println("Motorcycle stopped at red light.");
    }
    @Override
    public void accelerate() {
        System.out.println("The motorcycle accelerating to overtake.");
    }
}
