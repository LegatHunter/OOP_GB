package ru.geekbrains.lesson7.observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

class Vacancy {
    private String position;
    private int salary;
    private VacancyType type;

    public Vacancy(String position, int salary, VacancyType type) {
        this.position = position;
        this.salary = salary;
        this.type = type;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public VacancyType getType() {
        return type;
    }
}