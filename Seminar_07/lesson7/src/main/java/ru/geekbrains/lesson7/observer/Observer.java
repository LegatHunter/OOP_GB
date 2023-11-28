package ru.geekbrains.lesson7.observer;

interface Observer {
    void receiveOffer(String nameCompany, int salary);
    void receiveVacancy(Vacancy vacancy);
}