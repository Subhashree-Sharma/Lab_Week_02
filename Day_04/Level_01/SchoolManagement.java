import java.util.ArrayList;

// Course class
class Course {
    private String name;
    private ArrayList<Student> enrolledStudents;

    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public void viewEnrolledStudents() {
        System.out.println("Course: " + name);
        for (Student student : enrolledStudents) {
            System.out.println("Enrolled Student: " + student.getName());
        }
    }
}

// Student class
class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public void viewCourses() {
        System.out.println("Student: " + name);
        for (Course course : courses) {
            System.out.println("Enrolled in: " + course.getName());
        }
    }
}

// School class
class School {
    private String name;
    private ArrayList<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void viewStudents() {
        System.out.println("School: " + name);
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
        }
    }
}

// Main class to demonstrate association and aggregation
public class SchoolManagement {
    public static void main(String[] args) {
        School school = new School("Highland School");

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);

        student2.enrollInCourse(course1);

        school.addStudent(student1);
        school.addStudent(student2);

        school.viewStudents();

        student1.viewCourses();
        course1.viewEnrolledStudents();
    }
}
