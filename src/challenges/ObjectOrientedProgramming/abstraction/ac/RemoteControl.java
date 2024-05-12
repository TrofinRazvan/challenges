package challenges.ObjectOrientedProgramming.abstraction.ac;

public abstract class RemoteControl {

    private String brand;

    public RemoteControl(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void changeChannel(int channel);
}