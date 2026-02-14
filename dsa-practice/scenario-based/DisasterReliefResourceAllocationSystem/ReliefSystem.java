import java.util.Map;
import java.util.HashMap;
public class ReliefSystem {
    private Map<String ,ReliefCenter> centers= new HashMap<>();
    
    public void addCenter(String name , ReliefCenter center) {
    	centers.put(name, center);
    }
    
    public ReliefCenter getCenter(String name) {
    	return centers.get(name);
    }
}
