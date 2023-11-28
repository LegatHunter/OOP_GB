package ru.geekbrains.lesson7.observer;

import java.util.Random;

class Company {
    private Random random = new Random();
    private String name;
    private Publisher jobAgency;
    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    public void needEmployee() {
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary);
    }

    public void postVacancy() {
        int salary = random.nextInt(maxSalary);
        VacancyType type = getRandomVacancyType();
        Vacancy vacancy = new Vacancy("Software Engineer", salary, type);
        jobAgency.sendVacancy(vacancy);
    }

    private VacancyType getRandomVacancyType() {
        VacancyType[] types = VacancyType.values();
        return types[random.nextInt(types.length)];
    }
}
