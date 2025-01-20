class Patient {
    //static variable
    static String hospitalName;
    static int totalPatients = 0;

    //instance variables
    String name;
    int age;
    String ailment;

    //final variable for patient ID
    final int patientID;

    // Constructor
    Patient(String hospitalName, String name, int age, String ailment) {
        Patient.hospitalName = hospitalName;
        this.name = name;
        this.age = age;
        this.ailment = ailment;

        //increment static patient counter and assign unique ID
        totalPatients++;
        this.patientID = totalPatients;
    }

    //static method to get total patients
    public static void getTotalPatients() {
        System.out.println("Total number of patients are: " + totalPatients);
    }

    //using method to display patient details with instanceof check
    public void displayDetails(Object obj) {
        if (obj instanceof Patient) {
            // Cast obj to Patient
            Patient patient = (Patient) obj;
            System.out.println("Patient ID: " + patient.patientID);
            System.out.println("Name: " + patient.name);
            System.out.println("Age: " + patient.age);
            System.out.println("Ailment: " + patient.ailment);
            System.out.println("Hospital Name: " + hospitalName);
        } else {
            System.out.println("The provided object is not a Patient.");
        }
    }
}

// Main class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create patient objects
        Patient patient1 = new Patient("CityCare Hospital", "John Doe", 30, "Fever");
        Patient patient2 = new Patient("CityCare Hospital", "Jane Smith", 25, "Cold");

        // Display details of each patient with instanceof check
        System.out.println(" Patient 1 Details - ");
        patient1.displayDetails(patient1);

        System.out.println("\nPatient 2 Details - ");
        patient2.displayDetails(patient2);

        // invalid instanceof check
        System.out.println("\n=== Invalid Object Check ===");
        patient1.displayDetails("Not a Patient");

        //display total number of patients
        System.out.println();
        Patient.getTotalPatients();
    }
}
