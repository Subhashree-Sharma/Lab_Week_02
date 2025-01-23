
import java.util.ArrayList;
import java.util.List;

//student class
class Student {
    private String name;
    private int rollNumber;
    private List<Subject> subjects;

    //constructor of student class
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    //add subjects into Subject list
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }
}

//subject class
class Subject {
    private String name;
    private int marks;

    //constructor of subject class
    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

//GradeCalculator class
class GradeCalculator {

    public static String calculateGrade(Student student) {
        int totalMarks = 0;
        int subjectCount = student.getSubjects().size();

        if (subjectCount == 0) {
            return "No subjects available for grade calculation.";
        }

        for (Subject subject : student.getSubjects()) {
            totalMarks += subject.getMarks();
        }

        //calculate avg marks
        double averageMarks = (double) totalMarks / subjectCount;

        if (averageMarks >= 90) {
            return "A";
        } else if (averageMarks >= 75) {
            return "B";
        } else if (averageMarks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}

//main class
public class SchoolResultApplication{
    public static void main(String[] args) {

        //create a student
        Student student = new Student("John Doe", 101);

        //add subjects and their marks
        student.addSubject(new Subject("Math", 85));
        student.addSubject(new Subject("Science", 90));
        student.addSubject(new Subject("English", 78));

        //calculate and display the grade
        String grade = GradeCalculator.calculateGrade(student);
        System.out.println("Student: " + student.getName());
        System.out.println("Grade: " + grade);
    }
}
