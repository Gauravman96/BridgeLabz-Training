public class UsernameValidator {

    public static boolean isValidUsername(String username) {
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        return username.matches(regex);
    }

    public static void main(String[] args) {
        String[] testUsernames = {
            "user_123",
            "123user",
            "us",
            "User_Name",
            "user@123"
        };

        for (String username : testUsernames) {
            System.out.println(username + " -> " +
                (isValidUsername(username) ? "Valid" : "Invalid"));
        }
    }
}
