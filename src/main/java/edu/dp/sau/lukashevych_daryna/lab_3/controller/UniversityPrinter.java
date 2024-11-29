package edu.dp.sau.lukashevych_daryna.lab_3.controller;

import edu.dp.sau.lukashevych_daryna.lab_3.model.University;
import edu.dp.sau.lukashevych_daryna.lab_3.model.Faculty;
import edu.dp.sau.lukashevych_daryna.lab_3.model.Department;
import edu.dp.sau.lukashevych_daryna.lab_3.model.Group;
import edu.dp.sau.lukashevych_daryna.lab_3.model.Student;

public class UniversityPrinter {

    public void printUniversityDetails(University university) {
        System.out.println("University Name: " + university.getName());
        System.out.println("Head of University: " + university.getHead());
        System.out.println("Faculties: ");
        for (Faculty faculty : university.getFaculties()) {
            printFacultyDetails(faculty, 1);
        }
    }

    private void printFacultyDetails(Faculty faculty, int level) {
        String indent = "  ".repeat(level);
        System.out.println(indent + "Faculty Name: " + faculty.getName());
        System.out.println(indent + "Departments: ");
        for (Department department : faculty.getDepartments()) {
            printDepartmentDetails(department, level + 1);
        }
    }

    private void printDepartmentDetails(Department department, int level) {
        String indent = "  ".repeat(level);
        System.out.println(indent + "Department Name: " + department.getName());
        System.out.println(indent + "Groups: ");
        for (Group group : department.getGroups()) {
            printGroupDetails(group, level + 1);
        }
    }

    private void printGroupDetails(Group group, int level) {
        String indent = "  ".repeat(level);
        System.out.println(indent + "Group Name: " + group.getName());
        System.out.println(indent + "Students: ");
        for (Student student : group.getStudents()) {
            System.out.println(indent + "  " + student);
        }
    }
}