import java.util.*;

class HospitalManagement {
    private List<Patient> patients = new ArrayList<>();

    // CREATE
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added successfully.");
    }

    // READ
    public void displayAllPatients() {
        for (Patient p : patients) {
            p.displayInfo(); // Polymorphism
        }
    }

    // UPDATE (Change Doctor)
    public void updateDoctor(int patientId, Doctor newDoctor) {
        for (Patient p : patients) {
            if (p.getPatientId() == patientId) {
                System.out.println("Doctor updated for patient ID: " + patientId);
                return;
            }
        }
        System.out.println("Patient not found.");
    }

    // DELETE
    public void removePatient(int patientId) {
        patients.removeIf(p -> p.getPatientId() == patientId);
        System.out.println("Patient removed.");
    }
}
