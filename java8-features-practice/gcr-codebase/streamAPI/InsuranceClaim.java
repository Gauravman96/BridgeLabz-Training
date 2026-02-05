import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Claim {
    private String claimType;
    private double claimAmount;

    public Claim(String claimType, double claimAmount) {
        this.claimType = claimType;
        this.claimAmount = claimAmount;
    }

    public String getClaimType() {
        return claimType;
    }

    public double getClaimAmount() {
        return claimAmount;
    }
}

public class InsuranceClaim {
    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
            new Claim("Health", 12000),
            new Claim("Vehicle", 8000),
            new Claim("Health", 15000),
            new Claim("Property", 25000),
            new Claim("Vehicle", 10000),
            new Claim("Health", 18000),
            new Claim("Property", 30000)
        );

        // Average claim amount per claim type
        Map<String, Double> avgClaimAmount =
                claims.stream()
                    .collect(Collectors.groupingBy(
                Claim::getClaimType,Collectors.averagingDouble(Claim::getClaimAmount) ));


        avgClaimAmount.forEach((type, avg) ->
            System.out.println(type + " → Average Claim Amount: " + avg)
        );
    }
}
