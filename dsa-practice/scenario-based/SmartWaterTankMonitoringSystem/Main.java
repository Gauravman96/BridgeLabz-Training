import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    
    public static void main(String[] args) {
        List<WaterTank>tankList= new ArrayList<>();

        try {
            tankList.add(new WaterTank("T1",1000,800));
            tankList.add(new WaterTank("T2", 1000, 150));
            tankList.add(new WaterTank("T3", 1000, 50));
            tankList.add(new WaterTank("T4", 1000, 400));

            // This will throw exception
            tankList.add(new WaterTank("T5", 1000, 1200));
        } catch (InvalidWaterLevelException e) {
            System.out.println("exception"+ e.getMessage());
        }

        Collections.sort(tankList,new WaterTankComparator());


        System.out.println("\n Tank Report (Sorted by Lowest Level) \n");
        // Display tanks
        for (WaterTank tank : tankList) {

            tank.display();
        }
    }
}
