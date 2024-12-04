package edu.dp.sau.lukashevych_daryna.lab_3.controller;

import java.util.Arrays;
import java.util.List;
import edu.dp.sau.lukashevych_daryna.lab_3.model.Human;
import edu.dp.sau.lukashevych_daryna.lab_3.model.Sex;
import java.util.Random;
public class HumanCreator {
    private List<Human> predefinedStudents = Arrays.asList(
            new Human("John", "Doe", "M", Sex.MALE),
            new Human("Jane", "Smith", "E", Sex.FEMALE),
            new Human("Alice", "Johnson", "M", Sex.FEMALE),
            new Human("Bob", "Brown", "E", Sex.MALE),
            new Human("Charlie", "Davis", "A", Sex.MALE),
            new Human("Eve", "Taylor", "A", Sex.FEMALE),
            new Human("Mike", "Wilson", "R", Sex.MALE),
            new Human("Sophia", "Anderson", "R", Sex.FEMALE),
            new Human("Liam", "Moore", "J", Sex.MALE),
            new Human("Emily", "Martin", "G", Sex.FEMALE)
    );

    private Random random = new Random();
    public Human createHead() {
        return new Human("Viktor", "Jolt", "L", Sex.MALE);
    }

    public Human createUniqueStudent() {
        int index = random.nextInt(predefinedStudents.size());
        System.out.println("Index: " + index);
        return predefinedStudents.get(index);
    }

    public List<Human> createTestStudents() {
        return predefinedStudents;
    }
}


