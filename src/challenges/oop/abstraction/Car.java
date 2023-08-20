package challenges.oop.abstraction;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car started at green colour.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped at red light.");
    }

    @Override
    public void accelerate() {
        System.out.println("The car accelerating to overtake.");
    }
}
