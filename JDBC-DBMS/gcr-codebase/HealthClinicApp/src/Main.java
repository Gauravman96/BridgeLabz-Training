// import java.sql.Connection;

// import util.DBConnection;

// public class Main {
//     public static void main(String[] args) {

//         Connection conn = DBConnection.getConnection();

//         if (conn != null) {
//             System.out.println("Ready to perform DB operations!");
//         }
//     }
// }

import java.sql.Date;

import dao.PatientDAO;
import model.Patient;

public class Main {

    public static void main(String[] args) {

        PatientDAO dao = new PatientDAO();

        //  Register
        Patient patient = new Patient(
                "Rahul Sharma",
                Date.valueOf("2000-05-10"),
                "9876543210",
                "rahul@gmail.com",
                "Delhi",
                "O+"
        );

        dao.registerPatient(patient);

        // 2️ Update
        dao.updatePatient(1, "9999999999", "rahul_new@gmail.com", "Mumbai");
    }
}
