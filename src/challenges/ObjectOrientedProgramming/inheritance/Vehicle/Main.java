package challenges.ObjectOrientedProgramming.inheritance.Vehicle;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("BMW", "X5M", "White", 4);
        Bicycle bicycle = new Bicycle("Supra", "Devron", "blue", 21);

        System.out.println("Car:");
        car.displayInfo();

        System.out.println("\nBicycle:");
        bicycle.displayInfo();
    }
}