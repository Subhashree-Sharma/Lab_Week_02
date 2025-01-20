class Employee {

    //static, final variable
    static String companyName;
    static int totalEmployees = 0;

    private String name;
    private final int id;
    private String designation;

    // Constructor
    Employee(String companyName, String name, int id, String designation) {
        Employee.companyName = companyName;
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    //instance method to display employee details
    public void displayDetails() {
        System.out.println("Company name is - " + companyName);
        System.out.println("Person name - " + name);
        System.out.println("Id of employee - " + id);
        System.out.println("Designation - " + designation);
    }

    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total number of employees - " + totalEmployees);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee obj = new Employee("Capgemini", "Subhashree", 22, "Pune");

        //check if obj is an instance of Employee class
        boolean isTrue = obj instanceof Employee;

        //calling methods
        if (isTrue) {
            Employee.displayTotalEmployees();
            obj.displayDetails();
        } else {
            System.out.println("It is not an instance of the Employee class");
        }
    }
}
