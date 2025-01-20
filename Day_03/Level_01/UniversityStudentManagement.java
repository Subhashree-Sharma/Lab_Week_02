class Student{

    //static, and final variables
    static String universityName;
    private String name;
    final int rollNumber;
    private char grade;
    private static int totalStudents;

    //constructor
    Student(String universityName, String name, int rollNumber, char grade){
        Student.universityName = universityName;
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    //Method to display total students
    public void displayTotalStudents(){

        System.out.println("Total number of students - " + totalStudents);
    }

    //method to display details
    public void displayDetails(){
        System.out.println("University Name - " + universityName);
        System.out.println("Student Name - " + name);
        System.out.println("Roll_No - " + rollNumber);
        System.out.println("Grade of student - " + grade);
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {

        //obj of student class
        Student obj = new Student("RGPV", "Subhashree", 164, 'A');

       //checking instance and calling methods
        if(obj instanceof Student){
            obj.displayTotalStudents();
            obj.displayDetails();
        }

    }
}
