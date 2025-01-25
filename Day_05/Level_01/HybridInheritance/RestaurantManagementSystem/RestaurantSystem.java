package HybridInheritance.RestaurantManagementSystem;

//Person superclass
class Person {
    private String name;
    private int id;

    //constructor
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //method to display basic details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

//interface - Worker
interface Worker {
    //abstract method to be implemented by subclasses
    void performDuties();
}

//Subclass Chef
class Chef extends Person implements Worker {
    private String specialty;

    //Constructor
    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    //Implement performDuties method
    @Override
    public void performDuties() {
        System.out.println("Role: Chef");
        displayDetails();
        System.out.println("Specialty: " + specialty);
        System.out.println("Duties: Preparing meals and managing kitchen operations.");
    }
}

//Subclass Waiter
class Waiter extends Person implements Worker {
    private int tablesAssigned;

    //Constructor
    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    //Implement performDuties method
    @Override
    public void performDuties() {
        System.out.println("Role: Waiter");
        displayDetails();
        System.out.println("Tables Assigned: " + tablesAssigned);
        System.out.println("Duties: Taking orders and serving food to customers.");
    }
}

//main class
public class RestaurantSystem {
    public static void main(String[] args) {

        //create a Chef object
        Chef chef = new Chef("Gordon", 101, "Italian Cuisine");
        System.out.println("Chef Details:");
        chef.performDuties();
        System.out.println();

        //create a Waiter object
        Waiter waiter = new Waiter("John", 202, 5);
        System.out.println("Waiter Details:");
        waiter.performDuties();
    }
}
