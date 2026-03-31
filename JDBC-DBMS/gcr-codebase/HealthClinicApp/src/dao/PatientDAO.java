package dao;

import model.Patient;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PatientDAO {

    //  UPDATE PATIENT
    public void updatePatient(int id, String phone, String email, String address) {

        String query = "UPDATE patients SET phone = ?, email = ?, address = ? WHERE patient_id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            if (conn == null) {
                System.out.println("Database connection failed!");
                return;
            }

            stmt.setString(1, phone);
            stmt.setString(2, email);
            stmt.setString(3, address);
            stmt.setInt(4, id);

            int rows = stmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Patient updated successfully!");
            } else {
                System.out.println("Patient not found with ID: " + id);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //  REGISTER PATIENT
    public void registerPatient(Patient patient) {

        String checkQuery = "SELECT * FROM patients WHERE phone = ? OR email = ?";
        String insertQuery = "INSERT INTO patients (name, dob, phone, email, address, blood_group) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection()) {

            if (conn == null) {
                System.out.println("Database connection failed!");
                return;
            }

            // 1️ Check uniqueness
            try (PreparedStatement checkStmt = conn.prepareStatement(checkQuery)) {

                checkStmt.setString(1, patient.getPhone());
                checkStmt.setString(2, patient.getEmail());

                ResultSet rs = checkStmt.executeQuery();

                if (rs.next()) {
                    System.out.println("Patient already exists with same phone or email!");
                    return;
                }
            }

            // 2️ Insert patient
            try (PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {

                insertStmt.setString(1, patient.getName());
                insertStmt.setDate(2, patient.getDob());
                insertStmt.setString(3, patient.getPhone());
                insertStmt.setString(4, patient.getEmail());
                insertStmt.setString(5, patient.getAddress());
                insertStmt.setString(6, patient.getBloodGroup());

                int rows = insertStmt.executeUpdate();

                if (rows > 0) {
                    System.out.println("Patient Registered Successfully!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
