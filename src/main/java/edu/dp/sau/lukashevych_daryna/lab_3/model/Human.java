package edu.dp.sau.lukashevych_daryna.lab_3.model;


public class Human {
    public String firstName;
    public String lastName;
    public String patronymicName;
    public Sex sex;


    public Human (String firstName, String lastName, String patronymicName, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.sex=sex;
    }
}
