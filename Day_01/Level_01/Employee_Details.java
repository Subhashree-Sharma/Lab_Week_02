import java.util.Scanner;

class Employee {

    String name;
    int id;
    int salary;

   //constructor
    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

   //using method to display details
    public void DisplayDetails() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee salary: " + salary);
    }
}

public class Employee_Details {
    public static void main(String[] args) {

        // Using Scanner object for taking inputs
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Employee Salary: ");
        int salary = sc.nextInt();

        // Create an object of Employee class
        Employee employeeDetails = new Employee(name, id, salary);

        // Call the method to display details
        employeeDetails.DisplayDetails();

        sc.close();
    }
}
