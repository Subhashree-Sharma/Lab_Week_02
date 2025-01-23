import java.util.ArrayList;

//employee class
class Employee {
    private String name;
    private String position;

    //Constructor
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Get employee details
    public String getDetails() {
        return "Employee: " + name + ", Position: " + position;
    }
}

// Department class
class Department {
    private String name;
    private ArrayList<Employee> employees;

    // Constructor
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Add employee to department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Get employees in the department
    public void displayEmployees() {
        System.out.println("Department: " + name);
        if (employees.isEmpty()) {
            System.out.println("No employees in this department.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee.getDetails());
            }
        }
    }

    public String getName() {
        return null;
    }
}

// Company class
class Company {
    private String name;
    private ArrayList<Department> departments;

    // Constructor
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Add department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    //close company and clear all departments
    public void closeCompany() {
        System.out.println("Closing Company: " + name);
        //removes all departments and their employees
        departments.clear();
    }

    // Display company and department details
    public void displayDetails() {
        System.out.println("Company: " + name);
        if (departments.isEmpty()) {
            System.out.println("No departments in the company.");
        } else {
            for (Department department : departments) {
                department.displayEmployees();
            }
        }
    }
}

//Main class
public class CompanyAndDepartment{
    public static void main(String[] args) {
        //create a company object
        Company company = new Company("Tech Corp");

        //create departments
        Department dept1 = new Department("Engineering");
        Department dept2 = new Department("Human Resources");

        //Create employees
        Employee emp1 = new Employee("Alice", "Software Engineer");
        Employee emp2 = new Employee("Bob", "HR Manager");

        // Add employees to departments
        dept1.addEmployee(emp1);
        dept2.addEmployee(emp2);

        //add departments to company
        company.addDepartment(dept1);
        company.addDepartment(dept2);

        //display company details
        company.displayDetails();

        //close company
        company.closeCompany();
        company.displayDetails();
    }
}
