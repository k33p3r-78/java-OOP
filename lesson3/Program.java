package lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;

public class Program {
    static String names[] = {
                        "Михаил", "Александр", "Максим", "Марк",
                        "Артём", "Лев", "Матвей", "Иван",
                        "София", "Анна", "Мария", "Ева",
                        "Виктория", "Полина", "Варвара", "Алиса",
                        "Татьяна", "Алексей", "Владимир", "Екатерина"
                    };
    static String deps[] = {
                        "Кадры", "Бухгалтерия", "ИТ", "Закупки",
                        "Менеджеры", "Операторы"
    };
    static Integer salarys[] = {
                        35_000, 40_000, 50_000, 70_000, 100_000,
                        120_000, 150_000
    };

    public static void main(String[] args) {
        List<Employee> team = new ArrayList<>();
        Random r = new Random();

        for(int i = 0; i < 40; i++) {
            int j = r.nextInt(names.length);
            int k = r.nextInt(deps.length);
            int y = r.nextInt(salarys.length);
            team.add(new Employee(names[j], r.nextInt(20, 60), salarys[y], deps[k]));
        }

        System.out.println("Список до сортировки:");

        for (Employee employee : team) {
            employee.printEmployee();
        }

        Collections.sort(team, new EmployeeDepComparator().thenComparing(new EmployeeSalaryComparator().reversed()));
        Collections.sort(team);

        System.out.println("Список после сортировки:");

        for (Employee employee : team) {
            employee.printEmployee();
        }
    }
}
