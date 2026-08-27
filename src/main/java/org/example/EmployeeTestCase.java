package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeTestCase {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setEmpId(101);
        emp1.setEmpName("Arun");

        Employee emp2 = new Employee();
        emp2.setEmpId(102);
        emp2.setEmpName("Suresh");

        Employee emp3 = new Employee();
        emp3.setEmpId(103);
        emp3.setEmpName("Varun");

        List<Employee> empList = new ArrayList<>();

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        System.out.println("List of Employees:");

        for (Employee employee : empList) {

            System.out.println(employee);
        }

        Map<Integer, Employee> employeeMap = new HashMap<>();

        System.out.println("Employees in Map:");
        for (Employee employees : empList) {

            employeeMap.put(employees.getEmpId(), employees);

            System.out.println(employeeMap);
        }
    }
}
