package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeTestCase1 {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setEmpId(101);
        emp1.setEmpName("Arun");
        emp1.setEmpCity("Hyderabad");

        Employee emp2 = new Employee();
        emp2.setEmpId(102);
        emp2.setEmpName("Suresh");
        emp2.setEmpCity("Hyderabad");

        Employee emp3 = new Employee();
        emp3.setEmpId(103);
        emp3.setEmpName("Varun");
        emp3.setEmpCity("Pune");

        Employee emp4 = new Employee();
        emp4.setEmpId(104);
        emp4.setEmpName("Teja");
        emp4.setEmpCity("Pune");

        List<Employee> empList = new ArrayList<>();

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);

        Map<String, List<Employee>> employeeMap = new HashMap<>();

        for (Employee employee : empList) {

            String city = employee.getEmpCity();

            if (!employeeMap.containsKey(city)) {
                employeeMap.put(city, new ArrayList<>());
            }

            employeeMap.get(city).add(employee);
        }

        System.out.println(employeeMap);

/*      for (int i = 1; i <= 10000; i++) {
            Employee emp = new Employee();
            emp.setEmpId(100 + i);
            emp.setEmpName("Employee" + i);

            empList.add(emp);
        }*/


      /*        Employee foundEmployee = null;
        for (Employee employee : empList) {

            if(employee.getEmpId()!= null && employee.getEmpId() == 10073){

                System.out.println("Employee with 10073 details:" +employee.getEmpId() + " " + employee.getEmpName());
                foundEmployee = employee;
                break;
            }
        }
        System.out.println("Found:"+foundEmployee);
        Map<Integer, Employee> employeeMap = new HashMap<>();
        for (Employee employee : empList) {

            employeeMap.put(employee.getEmpId(), employee);

        }

        System.out.println("map found:"+employeeMap.get(10078));

 System.out.println("List of Employees:");

        for (Employee employee : empList) {

            System.out.println(employee);
        }

        System.out.println("Listed Employee details of Varun: " +empList.get(2));

        Map<Integer, Employee> employeeMap = new HashMap<>();

        System.out.println("Employees in Map:");
        for (Employee employee : empList) {

            employeeMap.put(employee.getEmpId(), employee);

        }
        System.out.println(employeeMap);

        System.out.println(employeeMap.get(10073));*/


    }
}