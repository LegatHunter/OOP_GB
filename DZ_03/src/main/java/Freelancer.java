import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
class Freelancer extends Employee {

    private double hourlyRate;

    public Freelancer(String surName, String name, double hourlyRate, int age) {
        super(surName, name, 0, age);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * hourlyRate;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Почасовая ставка: %.2f руб.; Среднемесячная заработная плата: %.2f руб.; возраст: %d лет",
                surName, name, hourlyRate, calculateSalary(), age);
    }
}