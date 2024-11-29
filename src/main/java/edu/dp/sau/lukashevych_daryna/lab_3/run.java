package edu.dp.sau.lukashevych_daryna.lab_3;


import edu.dp.sau.lukashevych_daryna.lab_3.model.*;
import edu.dp.sau.lukashevych_daryna.lab_3.controller.*;

public class run {
    public static void main(String[] args) {
        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.create();


        //UniversityCreator universityCreator = new UniversityCreator();
        //FacultyCreator facultyCreator = new FacultyCreator();
        //DepartmentCreator departmentCreator = new DepartmentCreator();
        //GroupCreator groupCreator = new GroupCreator();
        //University university = universityCreator.create();
        //UniversityPrinter printer = new UniversityPrinter();
        //printer.printUniversityDetails(university)
    }
}
