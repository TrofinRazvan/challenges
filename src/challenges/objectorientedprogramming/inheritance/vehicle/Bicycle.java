package challenges.objectorientedprogramming.inheritance.vehicle;

public class Bicycle extends Vehicle {

    private int numberOfGears;

    public Bicycle(String brand, String model,String color, int numberOfGears) {
        super(brand, model, color);
        this.numberOfGears = numberOfGears;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of gears: " + numberOfGears);
    }
}