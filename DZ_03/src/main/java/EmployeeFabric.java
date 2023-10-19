import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
class EmployeeFabric {

    private static Random random = new Random();

    public static Employee generateEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

        int choice = random.nextInt(2);

        if (choice == 0) {
            int salary = random.nextInt(60000, 120001);
            int age = random.nextInt(18, 65);
            return new Worker(
                    surnames[random.nextInt(surnames.length)],
                    names[random.nextInt(names.length)],
                    salary,
                    age);
        } else {
            double hourlyRate = random.nextDouble() * 500 + 50;
            int age = random.nextInt(18, 65);
            return new Freelancer(
                    surnames[random.nextInt(surnames.length)],
                    names[random.nextInt(names.length)],
                    hourlyRate,
                    age);
        }
    }
}
