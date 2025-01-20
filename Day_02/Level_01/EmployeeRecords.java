class Employee {
    //public member
    public String employeeID;

    //protected member
    protected String department;

    //private member
    private double salary;

    // Constructor
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    //getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary - public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //using method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}
// extending class
class Manager extends Employee {

    // Constructor
    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    //using method to display manager details accessing employeeID and department
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {

        //creating an Employee object
        Employee employee = new Employee("E12345", "IT", 55000.0);

        //display employee details
        employee.displayEmployeeDetails();

        //access and modify salary
        employee.setSalary(60000.0);
        System.out.println("\nUpdated Salary: $" + employee.getSalary());

        //creating a Manager object
        Manager manager = new Manager("M54321", "HR", 80000.0);

        //display manager details
        manager.displayManagerDetails();
    }
}
