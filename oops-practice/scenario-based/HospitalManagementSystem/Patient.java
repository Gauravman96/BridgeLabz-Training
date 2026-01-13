class Patient extends Person {
      String disease;
      String medicalHistory;

    public Patient(int id, String name, String disease, String medicalHistory) {
        super(id, name);
        this.disease= disease;
        this.medicalHistory= medicalHistory;
    }


    
}
