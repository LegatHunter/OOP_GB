package ru.geekbrains.lesson7.observer;

class Master implements Observer {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    private int salary = 80000;

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary) {
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        } else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }

    @Override
    public void receiveVacancy(Vacancy vacancy) {
        System.out.printf("Специалист %s: Получена вакансия: должность %s, тип %s, зарплата %d\n",
                name, vacancy.getPosition(), vacancy.getType(), vacancy.getSalary());
    }
}
