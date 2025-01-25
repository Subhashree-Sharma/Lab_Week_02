package HierarchicalInheritance.SchoolSystem;

//Person - base class
class Person {
    private String name;
    private int age;

    //constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //method to display basic details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass - Teacher
class Teacher extends Person {
    private String subject;

    //constructor
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    //method to display role and specific details
    public void displayRole() {
        System.out.println("Role: Teacher");
        displayDetails();
        System.out.println("Subject: " + subject);
    }
}

//Subclass - Student
class Student extends Person {
    private String grade;

    //Constructor
    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    //method to display role and specific details
    public void displayRole() {
        System.out.println("Role: Student");
        displayDetails();
        System.out.println("Grade: " + grade);
    }
}

//Subclass Staff
class Staff extends Person {
    private String position;

    //Constructor
    Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    //method to display role and specific details
    public void displayRole() {
        System.out.println("Role: Staff");
        displayDetails();
        System.out.println("Position: " + position);
    }
}

//main class
public class SchoolSystem {
    public static void main(String[] args) {

        //create a Teacher object
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        System.out.println("Teacher Details:");
        teacher.displayRole();
        System.out.println();

        //create a Student object
        Student student = new Student("Bob", 16, "10th Grade");
        System.out.println("Student Details:");
        student.displayRole();
        System.out.println();

        //create a Staff object
        Staff staff = new Staff("Charlie", 40, "Clerk");
        System.out.println("Staff Details:");
        staff.displayRole();
    }
}
