package edu.dp.sau.lukashevych_daryna.lab_3.model;

import java.util.List;

public class University extends Unit {
    private List<Faculty> faculties;

    public University(String name, Human head, List<Faculty> faculties) {
        super(name, head);
        this.faculties = faculties;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }
}
