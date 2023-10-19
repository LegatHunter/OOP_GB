import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
class Worker extends Employee {

    public Worker(String surName, String name, double salary, int age) {
        super(surName, name, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата: %.2f руб.; возраст: %d лет",
                surName, name, calculateSalary(), age);
    }
}