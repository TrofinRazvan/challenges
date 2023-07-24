package challenges.oop.abstraction;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        car.start();
        Vehicle truck = new Truck();
        truck.stop();
        Vehicle motorcyle = new Motorcycle();
        motorcyle.accelerate();
    }
}