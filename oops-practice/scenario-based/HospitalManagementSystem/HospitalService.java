public interface HospitalService {
     void addPatient(Patient patient);
     void removePatient(int patientId);
      void bookAppointment(Patient patient, Doctor doctor)
            throws AppointmentNotAvailableException;
            
    void viewMedicalHistory(int patientId);
}
