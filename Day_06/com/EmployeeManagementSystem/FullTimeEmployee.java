package com.EmployeeManagementSystem;

//fullTimeEmployee subclass implementing department
public class FullTimeEmployee extends Employee implements Department {
    private double fixedSalary;
    private String departmentName;

    //constructor of fullTime
     FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }
    //calculate salary
    @Override
    public double calculateSalary() {
        return fixedSalary;
    }

    //displaying result
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Full-Time Employee Salary: " + calculateSalary());
        System.out.println("Department: " + departmentName);
    }

    //department assigning
    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    //department details
    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}
