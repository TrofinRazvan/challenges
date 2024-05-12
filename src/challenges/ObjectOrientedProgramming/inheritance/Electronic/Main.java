package challenges.ObjectOrientedProgramming.inheritance.Electronic;

public class Main {

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S20", 999.99, "Android");
        Laptop laptop = new Laptop("Apple", "MacBook Pro", 1299.99, 13);

        System.out.println("Smartphone:");
        smartphone.displayInfo();

        System.out.println("\nLaptop:");
        laptop.displayInfo();
    }
}