package challenges.ObjectOrientedProgramming.abstraction.ac;

public class TVRemote extends RemoteControl{

    public TVRemote(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " TV is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " TV is turned off.");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println(getBrand() + " TV channel changed to " + channel);
    }
}