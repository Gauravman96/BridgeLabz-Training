public class LicensePlateValidator {

    public static boolean isValidPlate(String plate) {
        return plate.matches("^[A-Z]{2}[0-9]{4}$");
    }

    public static void main(String[] args) {
        String[] plates = { "AB1234", "A12345", "ab1234", "XY9876" };

        for (String plate : plates) {
            System.out.println(plate + "-> " +
                (isValidPlate(plate) ? "Valid" : "Invalid"));
        }
    }
}
