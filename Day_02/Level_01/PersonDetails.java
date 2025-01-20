import java.util.Scanner;
class person{
    String name;
    int age;
    int roll_No;

    //using parameterised constructor
    person(String name, int age, int roll_No){
        this.name = name;
        this.age = age;
        this.roll_No = roll_No;
    }

    //using copy constructor
    person(person two){
        this.name = two.name;
        this.age = two.age;
        this.roll_No = two.roll_No;
    }

    //method for displaying details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll_no " + roll_No);
    }
}
public class PersonDetails {
    public static void main(String[] args) {

        //using scanner for taking inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of a person - ");
        String name = sc.next();

        System.out.println("Enter the age - ");
        int age = sc.nextInt();

        System.out.println("Enter the roll no - ");
        int roll_No = sc.nextInt();

        //parameterised constructor object
        person parameterised = new person(name, age, roll_No);
        System.out.println("Calling parameterised constructor - ");
        parameterised.displayDetails();

        //creating a new person using the copy constructor
        person cloned_person  = new person(parameterised);
        System.out.println("Copy Constructor - Cloned Person Details:");
        cloned_person.displayDetails();
    }
}
