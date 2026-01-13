class Doctor extends Person {

    String specialization;

    public Doctor( int id, String name,String specialization) {
        super(id, name);
        this.specialization = specialization;
    }


    // polymorphism behavior

    double calculateConsultationFee() {
        return 500; // default
    }
    
    
}
