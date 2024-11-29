package edu.dp.sau.lukashevych_daryna.lab_3.model;

public abstract class Unit {
    private String name;
    private Human head;

    public Unit(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }
}
