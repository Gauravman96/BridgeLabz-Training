public class Appointment {
    
    int appointmentId;
    Patient patient;
    Doctor doctor;

    public Appointment(int appointmentId, Patient patient , Doctor doctor) {

        this.appointmentId= appointmentId;
        this.patient = patient;
        this.doctor= doctor;
    }


    

}
