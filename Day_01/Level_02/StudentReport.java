package Day_06.Level_02;

import java.util.Scanner;

class Student {
    String name;
    int roll_no;
    int marks;

   //constructor to initialize the student attributes
    Student(String name, int roll_no, int marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

   //using method to calculate grade based on marks
    public String calculateGrade() {
        if (marks > 90)
            return "A";
        else if (marks > 80 && marks <= 90)
            return "B";
        else
            return "C";
    }

   //using method to display student details
    public void DisplayDetails() {
        System.out.println("Student name: " + name);
        System.out.println("Student roll_no: " + roll_no);
        System.out.println("Student marks: " + marks);
        System.out.println("Student grade: " + calculateGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {

        // Using scanner object for taking inputs
        Scanner sc = new Scanner(System.in);

        // Input student details
        System.out.println("Enter the name of the student: ");
        String name = sc.next();

        System.out.println("Enter the roll number: ");
        int roll_no = sc.nextInt();

        System.out.println("Enter the marks of the student: ");
        int marks = sc.nextInt();

        // Create a Student object
        Student details = new Student(name, roll_no, marks);

        //display student details and grade
        details.DisplayDetails();

        // Close scanner
        sc.close();
    }
}
