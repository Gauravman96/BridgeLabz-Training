public class HospitalManagementSystem {

    public static void main(String[] args) {

        HospitalService hospital = new HospitalServiceImpl();

        Patient p1 = new Patient(1, "Gaurav", "Fever", "No major illness");
        Doctor d1 = new Doctor(101, "Dr. Sharma", "Physician");
        Doctor d2 = new Surgeon(102, "Dr. Mehta");

        hospital.addPatient(p1);

        try {
            hospital.bookAppointment(p1, d1);
            hospital.bookAppointment(p1, d2);
        } catch (AppointmentNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        hospital.viewMedicalHistory(1);
    }
}
