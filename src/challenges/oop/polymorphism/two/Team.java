package challenges.oop.polymorphism.two;

import java.util.List;

public class Team {

    private String name;
    private Employee teamLead;
    private List<Employee> members;

    public Team(String name, Employee teamLead, List<Employee> members) {
        this.name = name;
        this.teamLead = teamLead;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(Employee teamLead) {
        this.teamLead = teamLead;
    }

    public List<Employee> getMembers() {
        return members;
    }

    public void setMembers() {
        this.members = members;
    }
}