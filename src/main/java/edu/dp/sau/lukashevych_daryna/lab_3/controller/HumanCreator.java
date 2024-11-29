package edu.dp.sau.lukashevych_daryna.lab_3.controller;
import java.util.Arrays;
import java.util.List;
import edu.dp.sau.lukashevych_daryna.lab_3.model.Human;
import edu.dp.sau.lukashevych_daryna.lab_3.model.Sex;

public class HumanCreator {

    public Human createHead() {
        return new Human("Alex", "Ivanov", "Petrovich", Sex.MALE);
    }

    public List<Human> createTestStudents() {
        return Arrays.asList(
                new Human("John", "Doe", "Michael", Sex.MALE),
                new Human("Jane", "Smith", "Elizabeth", Sex.FEMALE),
                new Human("Alice", "Johnson", "Marie", Sex.FEMALE),
                new Human("Bob", "Brown", "Edward", Sex.MALE),
                new Human("Charlie", "Davis", "Andrew", Sex.MALE),
                new Human("Eve", "Taylor", "Anne", Sex.FEMALE),
                new Human("Mike", "Wilson", "Robert", Sex.MALE),
                new Human("Sophia", "Anderson", "Rose", Sex.FEMALE),
                new Human("Liam", "Moore", "James", Sex.MALE),
                new Human("Emily", "Martin", "Grace", Sex.FEMALE)
        );
    }
}
