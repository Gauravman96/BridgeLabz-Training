
public class Main {
    public static void main(String []args) {
    	ReliefSystem system = new ReliefSystem();

        ReliefCenter center =
                new ReliefCenter("Delhi Center");

        system.addCenter("Delhi", center);

        // add resources

        center.addResource("Food", 100);

        center.addResource("Water", 200);

        center.addResource("Medical", 50);


        // add requests
        center.addRequest(
                new AreaRequest("Area1", "Food", 20));

        center.addRequest(
                new AreaRequest("Area2", "Water", 50));

        center.addRequest(
                new AreaRequest("Area3", "Medical", 60));


        // process
        center.processRequests();

        // report

        center.generateReport();
    }
}
