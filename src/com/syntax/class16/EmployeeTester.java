package com.syntax.class16;

import com.syntax.class17.Employee;

public class EmployeeTester {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name="Merve";
        // employee.salary=125000; we cannot access it is public
       // employee.department="IT"; it is default for class 17 package accessible

        System.out.println(Employee.manager);
        Employee.printManager();

    }
}
