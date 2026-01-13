class Surgeon extends Doctor{

    public Surgeon(int id, String name) {
        super( id, name,"surgeon");
    }

    
    //override
    @Override

    double calculateConsultationFee(){
        return 1500;
    }
    


}