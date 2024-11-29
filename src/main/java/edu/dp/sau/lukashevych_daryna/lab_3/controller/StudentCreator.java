package edu.dp.sau.lukashevych_daryna.lab_3.controller;

import edu.dp.sau.lukashevych_daryna.lab_3.model.Human;
import edu.dp.sau.lukashevych_daryna.lab_3.model.Student;
import java.util.List;

public class StudentCreator {
    private final List<Human> students = new HumanCreator().createTestStudents();
    private int currentIndex = 0;

    public Student create() {
        if (currentIndex >= students.size()) {
            throw new RuntimeException("No more test students available!");
        }
        Human human = students.get(currentIndex++);
        return new Student(human.firstName, human.lastName, human.patronymicName, human.sex);
    }

}
