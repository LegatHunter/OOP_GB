package ru.geekbrains.lesson7.observer;

interface Publisher {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void sendOffer(String companyName, int salary);
    void sendVacancy(Vacancy vacancy);
}
