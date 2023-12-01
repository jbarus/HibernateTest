package org.example;

import jakarta.persistence.*;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;
    private String name;
    private String surname;
    @Enumerated(EnumType.STRING)
    private TeacherStatus status;
    private int yearOfBirth;
    private double salary;

    public Teacher(String name, String surname, TeacherStatus status, int yearOfBirth, double salary) {
        this.name = name;
        this.surname = surname;
        this.status = status;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }

    public Teacher() {

    }
}
