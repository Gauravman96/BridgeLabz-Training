public class WaterTank {
    private String tankId;
    private double capacity;
    private double currentLevel;

    //constructor
    public WaterTank(String tankId, double  capacity, double currentLevel) throws InvalidWaterLevelException{
            this.tankId= tankId;
            this.capacity= capacity;

            if(currentLevel> capacity){
                throw new InvalidWaterLevelException("current level cannot exceed this capacity of" + tankId);
            }
            this.currentLevel= currentLevel;
        
    }

    //calculate percentage

    public double getPercentage(){
        return(currentLevel/capacity)*100;
    }

    //alert method
    public void checkAlert(){
        if(getPercentage() <20){
            System.out.println("ALERT: Tank " + tankId +" water level below 20%");
        }
    }

    public String getTankId(){
        return tankId;
    }

    public double getCapacity(){
        return capacity;
    }

    public double getCurrentLevel(){
        return currentLevel;
    }


    public void display() {

        System.out.println("Tank ID: " + tankId);
        System.out.println("Capacity: " + capacity);
        System.out.println("Current Level: " + currentLevel);
        System.out.println("Percentage: " + getPercentage() + "%");

        checkAlert();

        System.out.println("--------------------");
    }

    
}

