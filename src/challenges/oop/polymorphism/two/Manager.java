package challenges.oop.polymorphism.two;

import java.util.List;

public class Manager implements User, Admin {

    private List<Employee> employees;
    private List<ConstructionResource> availableResources;

    public Manager(List<Employee> employees, List<ConstructionResource> availableResources) {
        this.employees = employees;
        this.availableResources = availableResources;
    }

    @Override
    public void makeChanges() {

    }

    @Override
    public void viewProgress() {

    }

    public void viewCompanyEmployees() {

    }

    public void viewAvailableResources() {

    }

    public void changeTeamStructure(Team team, List<Employee> members, Employee newTeamLead) {

    }

    public void changeEmployeePosition(Employee employee, String newPosition) {

    }
}