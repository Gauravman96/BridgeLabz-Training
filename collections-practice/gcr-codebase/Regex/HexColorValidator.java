public class HexColorValidator {

    public static boolean isValidHexColor(String color) {
        return color.matches("^#[A-Fa-f0-9]{6}$");
    }

    public static void main(String[] args) {
        String[] colors = {
        "#FFA500",
            "#ff4500",
            "#123",
            "#GGGGGG"
        };

        for (String color : colors) {
            System.out.println(color + " -> " +
                (isValidHexColor(color) ? "Valid" : "Invalid"));
        }
    }
}
