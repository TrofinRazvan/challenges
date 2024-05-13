package challenges.objectorientedprogramming.abstraction.ac;

public class Main {

    public static void main(String[] args) {
        RemoteControl tvRemote = new TVRemote("Samsung");
        tvRemote.turnOn();
        tvRemote.changeChannel(5);
        tvRemote.turnOff();

        System.out.println();

        RemoteControl acRemote = new ACRemote("Samsung 'again'");
        acRemote.turnOn();
        acRemote.changeChannel(22);
        acRemote.turnOff();
    }
}