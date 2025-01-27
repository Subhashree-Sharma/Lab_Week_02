package com.EmployeeManagementSystem;

//partTimeEmployee subclass
public class PartTimeEmployee extends Employee implements Department {
    private int workHours;
    private double hourlyRate;
    private String departmentName;

    //constructor
     PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    //calculate salary
    @Override
    public double calculateSalary() {
        return workHours * hourlyRate;
    }

    //printing details of partTime employee
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Part-Time Employee Salary: " + calculateSalary());
        System.out.println("Department: " + departmentName);
    }

    //assigning department
    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    //get department details
    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}
