class Patient {
    int patientId;
    String patientName;
    int age;

    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    void displayPatient() {
        System.out.println("ID: " + patientId);
        System.out.println("Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

class PatientManager {

    void displayAllPatients(Patient[] patients) {

        // Local loop variable
        for (int i = 0; i < patients.length; i++) {
            patients[i].displayPatient();
        }
    }
}

public class PatientMain {
    public static void main(String[] args) {

        Patient[] patients = {
            new Patient(1, "Aman", 20),
            new Patient(2, "Riya", 22),
            new Patient(3, "Rahul", 25),
            new Patient(4, "Neha", 21),
            new Patient(5, "Karan", 24)
        };

        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }
}