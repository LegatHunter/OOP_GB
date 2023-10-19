import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Program {

    public static void main(String[] args) {
        Employee[] employees = new Employee[15];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = EmployeeFabric.generateEmployee();
        }

        System.out.println("Несортированный список сотрудников:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new SalaryComparator());

        System.out.println("\nСортировка по зарплате:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new AgeComparator());

        System.out.println("\nСортировка по возрасту:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}