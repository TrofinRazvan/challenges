package challenges.oop.inheritance;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Matei", 2, "Canice", "Labrador", "Medium");
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getSpecies());
        System.out.println(dog.getBreed());
        System.out.println(dog.getSize());

        dog.bark();
        dog.fetch();
    }
}
