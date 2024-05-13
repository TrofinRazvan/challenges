package challenges.objectorientedprogramming.abstraction.ac;

public class ACRemote extends RemoteControl{

    public ACRemote(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " AC is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " AC is turned off.");
    }

    @Override
    public void changeChannel(int temperature) {
        System.out.println(getBrand() + " AC temperature changed to " + temperature + "°C");
    }
}