package LambdasAndStreams;

import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeStream {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", 70000),
                new Employee("Bob", 45000),
                new Employee("Charlie", 85000)
        );

        List<String> highEarners = employees.stream()
                .filter(e -> e.salary > 60000)
                .map(e -> e.name)
                .collect(Collectors.toList());

        System.out.println("High earners: " + highEarners);  // [Alice, Charlie]
    }
}

