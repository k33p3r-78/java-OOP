package lesson3;

/**
   * Реализовать класс Сотрудник (Employee) c полями:
   * 1. Имя
   * 2. Возраст
   * 3. Зарплата
   * 4. Наименование департамента
   *
   * Необходимо:
   * 1. Создать список из разных сотрудников (штук 20)
   * 2. Отсортировать список по возрастанию возраста, по убыванию зарплаты, и по наименованию отдела (в лексикографическом порядке) (вывести на консоль).
   * Подумать о том, какую сортирвку сделать по умолчанию (заложить в класс, интерфейс Comparable), а какие две сделать внешними (интерфейс Comparator).
   */

public class Employee implements Comparable<Employee> {
    protected String name;
    protected Integer age;
    protected Integer salary;
    protected String dep;


    public Employee(String name, Integer age, Integer salary, String dep) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dep = dep;
    }

    public void printEmployee() {
        System.out.println("[ " + this.name + ", " + this.age + ", " +
                            this.salary + ", " + this.dep + " ]");
    }

    @Override
    public int compareTo(Employee o) {
        if (age.compareTo(o.age) != 0) {
            return age.compareTo(o.age);
        } else {
            return name.compareTo(o.name);
        }
    }

    
}
