package challenges.oop.abstraction;

public class Truck implements Vehicle {

    @Override
    public void start() {
        System.out.println("Truck started at green colour.");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopped at red colour.");
    }

    @Override
    public void accelerate() {
        System.out.println("The truck accelerates.");
    }
}
