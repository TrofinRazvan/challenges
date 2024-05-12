package challenges.ObjectOrientedProgramming.inheritance.Electronic;

public class Smartphone extends ElectronicDevice{

    private String operatingSystem;

    public Smartphone(String brand, String model, double price, String operatingSystem) {
        super(brand, model, price);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Operating System: " + operatingSystem);
    }
}