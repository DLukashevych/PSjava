package edu.dp.sau.lukashevych_daryna.lab_3.controller;


import edu.dp.sau.lukashevych_daryna.lab_3.model.Group;
import edu.dp.sau.lukashevych_daryna.lab_3.model.Human;
import edu.dp.sau.lukashevych_daryna.lab_3.model.Student;

import java.util.ArrayList;
import java.util.List;

public class GroupCreator {

    private static int groupCounter = 1;

    public Group create() {
        String groupName = "Group-" + groupCounter++;
        Human head = new StudentCreator().create();

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            students.add(new StudentCreator().create());
        }

        return new Group(groupName, students);
    }
}
