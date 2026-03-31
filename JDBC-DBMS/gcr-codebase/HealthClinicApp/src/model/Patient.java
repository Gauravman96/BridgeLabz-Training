package model;

import java.sql.Date;

public class Patient {

    private String name;
    private Date dob;
    private String phone;
    private String email;
    private String address;
    private String bloodGroup;

    public Patient(String name, Date dob, String phone, String email, String address, String bloodGroup) {
        this.name = name;
        this.dob = dob;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.bloodGroup = bloodGroup;
    }

    // Getters
    public String getName() { return name; }
    public Date getDob() { return dob; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }
    public String getBloodGroup() { return bloodGroup; }
}
