package challenges.oop.inheritance;

public class Dog extends Animal {

    private String breed;
    private String size;

    public Dog(String name, int age, String species, String breed, String size) {
        super(name, age, species);
        this.breed = breed;
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public void bark() {
        System.out.println(getName() + " is barking!");
    }
    public void fetch() {
        System.out.println(getName() + " is fetching the stick");
    }
}
