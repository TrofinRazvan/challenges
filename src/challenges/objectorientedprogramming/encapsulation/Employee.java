package challenges.objectorientedprogramming.encapsulation;

public class Employee {

    private int id;
    private String name;
    private double wage;

    private Employee(int id, String name, double wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double calculateBonus(double percentage) {
        return wage * percentage / 100;
    }

    public void updateDetails(String newName, double newWage) {
        this.name = newName;
        this.wage = newWage;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Gica Hagi", 5243);

        System.out.println("Original Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Salary: " + employee.getWage() + " RON");

        double bonus = employee.calculateBonus(13);
        System.out.println("Bonus: " + bonus + " RON");

        employee.updateDetails("Piturca", 55000);
        System.out.println("\nUpdated Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Wage: " + employee.getWage() + " RON");
    }
}