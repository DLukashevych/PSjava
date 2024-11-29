package edu.dp.sau.lukashevych_daryna.lab_3.controller;

import edu.dp.sau.lukashevych_daryna.lab_3.model.Human;
import edu.dp.sau.lukashevych_daryna.lab_3.model.Faculty;
import edu.dp.sau.lukashevych_daryna.lab_3.model.University;

import java.util.ArrayList;
import java.util.List;


public class UniversityCreator {

    public University create() {
        String universityName = "Dnipro University of Technology";
        Human head = new HumanCreator().createHead();

        List<Faculty> faculties = new ArrayList<>();
        FacultyCreator facultyCreator = new FacultyCreator();
        faculties.add(facultyCreator.create());
        faculties.add(facultyCreator.create());

        return new University(universityName, head, faculties);
    }
}
