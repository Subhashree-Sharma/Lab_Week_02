package com.EmployeeManagementSystem;

import java.util.ArrayList;
//main class
public class EmployeeManagement {
    public static void main(String[] args) {

        //using arrayList for storing employee data
        ArrayList<Employee> employees = new ArrayList<>();

        //obj for full time employee
        FullTimeEmployee fte = new FullTimeEmployee(164, "Subhashree", 50000, 30000);
        fte.assignDepartment("CSE Department");
        employees.add(fte);

        //obj for partTime employee
        PartTimeEmployee pte = new PartTimeEmployee(22, "Riya", 20000, 8, 1000);
        pte.assignDepartment("AIML department");
        employees.add(pte);

        //printing employee details
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println();
        }
    }
}
