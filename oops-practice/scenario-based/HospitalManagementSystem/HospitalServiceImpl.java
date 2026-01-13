import java.util.*;

class HospitalServiceImpl implements HospitalService {

    List<Patient> patients = new ArrayList<>();
    List<Appointment> appointments = new ArrayList<>();
    int appointmentCounter = 1;

    @Override
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added: " + patient.name);
    }

    @Override
    public void removePatient(int patientId) {
        patients.removeIf(p -> p.id == patientId);
        System.out.println("Patient removed");
    }

    @Override
    public void bookAppointment(Patient patient, Doctor doctor)
            throws AppointmentNotAvailableException {

        for (Appointment a : appointments) {
            if (a.doctor.id == doctor.id) {
                throw new AppointmentNotAvailableException(
                        "Doctor already has an appointment!");
            }
        }

        Appointment appointment =
                new Appointment(appointmentCounter++, patient, doctor);
        appointments.add(appointment);

        System.out.println("Appointment booked with Dr. " + doctor.name);
        System.out.println("Consultation Fee: ₹" +
                doctor.calculateConsultationFee());
    }

    @Override
    public void viewMedicalHistory(int patientId) {
        for (Patient p : patients) {
            if (p.id == patientId) {
                System.out.println("Medical History: " + p.medicalHistory);
                return;
            }
        }
        System.out.println("Patient not found");
    }
}
