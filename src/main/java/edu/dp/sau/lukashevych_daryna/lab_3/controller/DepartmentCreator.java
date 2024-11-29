package edu.dp.sau.lukashevych_daryna.lab_3.controller;
import java.util.List;
import java.util.ArrayList;


import edu.dp.sau.lukashevych_daryna.lab_3.model.Group;
import edu.dp.sau.lukashevych_daryna.lab_3.model.Human;
import edu.dp.sau.lukashevych_daryna.lab_3.model.Department;


public class DepartmentCreator {

    private static int departmentCounter = 1;

    public Department create() {
        String departmentName = "Department-" + departmentCounter++;
        Human head = new StudentCreator().create();

        List<Group> groups = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            groups.add(new GroupCreator().create());
        }

        return new Department(departmentName, head, groups);
    }
}