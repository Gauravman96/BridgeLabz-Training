import java.util.Comparator;
class WaterTankComparator implements Comparator<WaterTank> {
    public int compare(WaterTank t1, WaterTank t2) {

        return Double.compare(t1.getCurrentLevel(), t2.getCurrentLevel());
    }
    
}
