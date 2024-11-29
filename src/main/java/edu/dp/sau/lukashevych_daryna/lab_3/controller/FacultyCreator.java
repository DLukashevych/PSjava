package edu.dp.sau.lukashevych_daryna.lab_3.controller;
import java.util.List;
import java.util.ArrayList;
import edu.dp.sau.lukashevych_daryna.lab_3.model.Faculty;
import edu.dp.sau.lukashevych_daryna.lab_3.model.Human;
import edu.dp.sau.lukashevych_daryna.lab_3.model.Department;

public class FacultyCreator {

    private static int facultyCounter = 1;

    public Faculty create() {
        String facultyName = "Faculty-" + facultyCounter++;
        Human head = new StudentCreator().create();

        List<Department> departments = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            departments.add(new DepartmentCreator().create());
        }

        return new Faculty(facultyName, head, departments);
    }
}
