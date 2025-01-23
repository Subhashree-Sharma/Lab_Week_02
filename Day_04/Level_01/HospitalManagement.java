import java.util.ArrayList;
import java.util.List;

//hospital class
class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    //constructor
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    //add doctor and patient
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    //display details
    public void showDetails() {
        System.out.println("Hospital Name: " + name);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(" - " + doctor.getName());
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println(" - " + patient.getName());
        }
    }
}

//doctor class
class Doctor {
    private String name;
    private List<Patient> patients;

    //constructor
    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // add patient
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            // Establish bidirectional association
            patient.addDoctor(this);
        }
    }

    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Dr. " + name + " is consulting with " + patient.getName());
        } else {
            System.out.println("Dr. " + name + " does not have a relationship with " + patient.getName());
        }
    }
}

//patient class
class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            //establish bidirectional association
            doctor.addPatient(this);
        }
    }

    //list doctors
    public void listDoctors() {
        System.out.println(name + " is consulting with the following doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(" - Dr. " + doctor.getName());
        }
    }
}

//main class
public class HospitalManagement{
    public static void main(String[] args) {
        //create a hospital
        Hospital hospital = new Hospital("City Hospital");

        //create doctors
        Doctor doctor1 = new Doctor("Subhashree");
        Doctor doctor2 = new Doctor("Sharmaji");

        //create patients
        Patient patient1 = new Patient("Riya");
        Patient patient2 = new Patient("Aman");

        //cdd doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Establish relationships
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient1);

        // Consultations
        doctor1.consult(patient1);
        doctor2.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient2);

        //list doctors for a patient
        patient1.listDoctors();
        patient2.listDoctors();

        //show hospital details
        hospital.showDetails();
    }
}
