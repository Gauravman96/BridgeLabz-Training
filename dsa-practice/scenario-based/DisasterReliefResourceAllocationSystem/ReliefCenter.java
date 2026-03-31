import java.util.*;

import javax.naming.InsufficientResourcesException;
public class ReliefCenter {
     private String centerName;
     private HashMap<String ,Integer> resources = new HashMap<>();
     private Queue<AreaRequest> requests = new LinkedList<>();
     
     public ReliefCenter(String centerName) {
    	 this.centerName = centerName;
     }
     
     //Add resources
     public void addResource(String resource, int quantity) {
    	  resources.put(resource, resources.getOrDefault(resource, 0) + quantity);
     }
     
     //Add request
     public void addRequest(AreaRequest request) {
    	 requests.add(request);
     }
     
     // processing request FIFO
     public void processRequests() {
    	 
    	 while(!requests.isEmpty()) {
    		 AreaRequest request= requests.poll();
    		 
    		 try {
    			 allocateResource(request);
    		 }catch(InsufficientResourcesException e) {
    			 System.out.println(e.getMessage());
    		 }
    	 }
     }
     
     // Allocated Logic
     private void allocateResource(AreaRequest request)
         throws InsufficientResourcesException{
    	 
    	 String resource = request.getResourceType();
    	 
    	 int available= resources.getOrDefault(resource, 0);
    	 
    	 if(available >= request.getQuantity()) {
    		 resources.put(resource,available- request.getQuantity());
    		 
    		 System.out.println(  "Allocated " +
                            request.getQuantity() +
                            " " + resource +
                            " to " +
                            request.getAreaName()
            );
    	 }else {
    		 throw new InsufficientResourcesException("Insufficient" + resource+ " for " +request.getAreaName());
    	 }
     }
     
  // Report
     public void generateReport() {

         System.out.println("\nRemaining Resources:");

         for(Map.Entry<String,Integer> entry : resources.entrySet()) {

             System.out.println(
                     entry.getKey() +
                             " : " +
                             entry.getValue()
             );
         }
     }
     
     
     
     
     
     
     
     
     
     
}
