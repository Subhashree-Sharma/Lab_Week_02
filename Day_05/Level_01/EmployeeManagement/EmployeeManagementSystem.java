package EmployeeManagement;

//employee class
class  Employee{
    private String name;
    private int id;
    private long salary;

    //constructor of employee class
    Employee(String name, int id, Long salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //method for displaying details
    public void displayDetails(){
        System.out.println("Name - " + name + " id - " + id + " salary - " + salary);
    }
}

//manager class
class Manager extends Employee{

        private int teamSize;

        //constructor of manager class
        Manager(String name, int id, Long salary, int teamSize){
            super(name, id, salary);
            this.teamSize = teamSize;
        }

        //display details
    @Override
    public void displayDetails() {
        System.out.println("Manager Details - ");
            super.displayDetails();
            System.out.println("Team Size - " + teamSize);
    }
}

//developer class
class Developer extends Employee{
    private String programmingLang;

    //constructor of developer class
    Developer(String name, int id, Long salary, int teamSize, String programmingLang){
        super(name, id, salary);
        this.programmingLang = programmingLang;
    }

    //method for displaying details
    @Override
    public void displayDetails() {
        System.out.println("Developer details - ");
        super.displayDetails();
        System.out.println("Programming Language - "+ programmingLang);
    }
}

//intern class
class Intern extends Employee{

        int age;

        //constructor of intern class
        Intern(String name, int id, Long salary, int age){
            super(name, id, salary);
            this.age = age;
        }

        //display method
    @Override
    public void displayDetails() {
        System.out.println("Intern details - ");
        super.displayDetails();
        System.out.println("Age of intern - " + age);
    }
}

//main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {

        //create obj of subclasses
        Employee manager = new Manager("Subha" , 164, 78788L, 4);
        Employee developer = new Developer("Kaliya", 34, 23432L, 5, "Java");
        Employee intern = new Intern("Shera", 45, 75685L, 19);

        //displaying details of subclasses
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();

    }
}
