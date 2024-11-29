package edu.dp.sau.lukashevych_daryna.lab_3.model;

import java.util.List;

public class Group extends Unit {
    private List<Student> student;


    public Group(String name,  List<Student> students) {
        super(name,null);
        this.student = students;
    }

    public List<Student> getStudents() {
        return student;
    }


}