package edu.dp.sau.lukashevych_daryna.lab_3.model;


import java.util.List;

public class Faculty extends Unit {
    private List<Department> department;

    public Faculty(String name, Human head, List<Department> department) {
        super(name, head);
        this.department = department;
    }

    public List<Department> getDepartments() {
        return department;
    }
}
