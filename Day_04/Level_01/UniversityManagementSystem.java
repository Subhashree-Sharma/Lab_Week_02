import java.util.ArrayList;
import java.util.List;

//university class
class University {
    private String name;
    private List<Student3> students;
    private List<Professor> professors;
    private List<Course3> courses;

    //constructor
    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    //add student
    public void addStudent(Student3 student) {
        students.add(student);
    }

    //add professor
    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    //add course
    public void addCourse(Course3 course) {
        courses.add(course);
    }

    //display details
    public void showDetails() {
        System.out.println("University Name: " + name);
        System.out.println("Students:");
        for (Student3 student : students) {
            System.out.println(" - " + student.getName());
        }
        System.out.println("Professors:");
        for (Professor professor : professors) {
            System.out.println(" - " + professor.getName());
        }
        System.out.println("Courses:");
        for (Course3 course : courses) {
            System.out.println(" - " + course.getName());
        }
    }
}

//Student3 class
class Student3 {
    private String name;
    private List<Course3> courses;

    //constructor
    public Student3(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    //using method for adding courses
    public void enrollCourse(Course3 course) {
        if (!courses.contains(course)) {
            courses.add(course);
            //establish bidirectional association
            course.addStudent(this);
        }
    }

    //list courses
    public void listCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course3 course : courses) {
            System.out.println(" - " + course.getName());
        }
    }
}

// professor class
class Professor {
    private String name;
    private List<Course3> courses;

    //constructor
    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course3 course) {
        if (!courses.contains(course)) {
            courses.add(course);
            //establish association with the course
            course.setProfessor(this);
        }
    }

    public void listCourses() {
        System.out.println(name + " is teaching the following courses:");
        for (Course3 course : courses) {
            System.out.println(" - " + course.getName());
        }
    }
}

class Course3 {
    private String name;
    private Professor professor;
    private List<Student3> students;

    //constructor
    public Course3(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    //add students
    public void addStudent(Student3 student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    //display details
    public void showDetails() {
        System.out.println("Course Name: " + name);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        } else {
            System.out.println("Professor: Not assigned");
        }
        System.out.println("Students:");
        for (Student3 student : students) {
            System.out.println(" - " + student.getName());
        }
    }
}

//main class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        //create a university
        University university = new University("RGPV University");

        //create professors
        Professor professor1 = new Professor("Dr. Prakash");
        Professor professor2 = new Professor("Dr. Rakesh");

        //create students
        Student3 student1 = new Student3("Subha");
        Student3 student2 = new Student3("Shree");
        Student3 student3 = new Student3("Riya");

        //create courses
        Course3 course1 = new Course3("Mathematics");
        Course3 course2 = new Course3("Computer Science");

        //add professors, students, and courses to the university
        university.addProfessor(professor1);
        university.addProfessor(professor2);

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        university.addCourse(course1);
        university.addCourse(course2);
        //assign professors to courses
        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        //enroll students in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student3.enrollCourse(course2);

        //show details
        course1.showDetails();
        course2.showDetails();

        student1.listCourses();
        professor1.listCourses();

        //show university details
        university.showDetails();
    }
}
