class Patient{
 static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    // Instance variables
    String name;
    int age;
    String ailment;
    final String patientID;   


    Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
        System.out.println("Hospital Name: " + hospitalName);
    }
     void displayPatientDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;

            System.out.println("Patient ID: " + p.patientID);
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Ailment: " + p.ailment);
            System.out.println("Hospital Name: " + hospitalName);
        }
    }
}
public class HospitalManagementSystem {
    public static void main(String[] args) {
         Patient p1 = new Patient("P001", "Lathika", 30, "Flu");
        Patient p2 = new Patient("P002", "Lidiya", 45, "Fracture");

        Patient.getTotalPatients();

        p1.displayPatientDetails(p1);
        p2.displayPatientDetails(p2);
    }
}
 