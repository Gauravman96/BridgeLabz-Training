public class EarthVolume {
    public static void main(String[] args) {
         double radiusKm = 6378;
        double pi = 3.14159;

        // Volume in cubic kilometers
        double volumeKm = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;

        // Convert cubic kilometers to cubic miles
        // 1 mile = 1.6 km → 1 cubic mile = (1.6)^3 cubic km
        double volumeMiles = volumeKm / (1.6 * 1.6 * 1.6);

        System.out.println("The volume of earth in cubic kilometers is " 
                            + volumeKm + 
                           " and cubic miles is " + volumeMiles);
    }
    
}
