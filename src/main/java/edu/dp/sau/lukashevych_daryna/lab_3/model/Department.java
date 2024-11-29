package edu.dp.sau.lukashevych_daryna.lab_3.model;


import java.util.List;

public class Department extends Unit {
    private List<Group> group;

    public Department(String name, Human head, List<Group> group) {
        super(name, head);
        this.group = group;
    }

    public List<Group> getGroups() {
        return group;
    }
}
