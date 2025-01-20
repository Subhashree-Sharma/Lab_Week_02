import java.util.Scanner;

class Course {
    //instance Variables
    private String courseName;
    private int duration;
    private long fee;

    //static Class Variable
    private static String instituteName = " ";

    //constructor
    public Course(String courseName, int duration, long fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    //static Method to Update the Institute Name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    //instance Method to Display Course Details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }
}

public class OnlineCourseManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input Course Details
        System.out.println("Enter course name:");
        String courseName = sc.nextLine();

        System.out.println("Enter course duration in months - ");
        int duration = sc.nextInt();

        System.out.println("Enter course fee:");
        long fee = sc.nextLong();

        //create a Course Object
        Course course = new Course(courseName, duration, fee);

        System.out.println("Enter new institute name:");
        sc.nextLine();
        String newInstituteName = sc.nextLine();
        Course.updateInstituteName(newInstituteName);

        //display Course Details
        System.out.println("\nCourse Details:");
        course.displayCourseDetails();

        //scanner closed
        sc.close();
    }
}
