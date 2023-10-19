import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surName;
    protected double salary;
    protected int age;

    public Employee(String surName, String name, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0) {
            return name.compareTo(o.name);
        }
        return surNameRes;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("%s %s; ставка: %.2f руб.; заработная плата: %.2f руб.; возраст: %d лет",
                surName, name, salary, calculateSalary(), age);
    }
}
