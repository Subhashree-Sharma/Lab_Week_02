class Student {
    //public member
    public int rollNumber;

    //protected member
    protected String name;

    //private member
    private double CGPA;

    //constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    //public getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // public setter for CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Please enter a value between 0.0 and 10.0.");
        }
    }

    //public method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

//using subclass to demonstrate protected member access
class PostgraduateStudent extends Student {

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    //method to display postgraduate student details
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        // CGPA cannot be accessed directly as it is private
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        //create a Student object
        Student student = new Student(101, "Alice", 8.5);
        student.displayDetails();

        //modify and display CGPA
        student.setCGPA(9.0);
        System.out.println("Updated CGPA: " + student.getCGPA());

        //create a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Bob", 9.2);
        pgStudent.displayPostgraduateDetails();
    }
}

