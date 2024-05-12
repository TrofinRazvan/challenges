package challenges.ObjectOrientedProgramming.inheritance.Electronic;

public class Laptop extends ElectronicDevice {

    private int screenSize;

    public Laptop(String brand, String model, double price, int screenSize) {
        super(brand, model, price);
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size: " + screenSize + " inches");
    }
}