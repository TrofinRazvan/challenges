package challenges.ObjectOrientedProgramming.inheritance.Vehicle;

public class Car extends Vehicle{

    private int numberOfSeats;

    public Car(String brand, String model, String color, int numberOfSeats) {
        super(brand, model, color);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of seats: " + numberOfSeats);
    }
}