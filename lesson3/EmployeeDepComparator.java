package lesson3;

import java.util.Comparator;

public class EmployeeDepComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.dep.compareTo(o2.dep);
    }
    
}
