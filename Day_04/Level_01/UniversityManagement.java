import java.util.ArrayList;
import java.util.List;

//university class
class University2 {
    private String name;
    private List<Department> departments;

    //constructor
    public University2(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    //add department
    public void addDepartment(Department department) {
        departments.add(department);
    }

    //display details
    public void showDetails() {
        System.out.println("University Name: " + name);
        System.out.println("Departments - ");
        for (Department department3 : departments) {
            System.out.println(" - " + department3.getName());
        }
    }
    // deleting univeristy
    public void deleteUniversity() {
        departments.clear();
        System.out.println("University and all departments have been deleted.");
    }
}

//department class
class Department3 {
    private String name;

    //constructor
    public Department3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

//faculty class
class Faculty {
    private String name;

    //constructor
    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //display details
    public void showDetails() {
        System.out.println("Faculty Name: " + name);
    }
}

//main class
public class UniversityManagement {
    public static void main(String[] args) {

        //create university object
        University2 university = new University2("RGPV University");

        //create departments
        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Mathematics");

        //add departments to university
        university.addDepartment(dept1);
        university.addDepartment(dept2);

        //create faculty members
        Faculty faculty1 = new Faculty("Subhashree");
        Faculty faculty2 = new Faculty("Sharmaji");

        //display details
        university.showDetails();
        faculty1.showDetails();
        faculty2.showDetails();

        //delete university and its departments
        university.deleteUniversity();
    }
}
