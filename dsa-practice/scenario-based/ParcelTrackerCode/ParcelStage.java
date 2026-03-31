
public class ParcelStage {
    String stage;
    ParcelStage next;

    ParcelStage(String stage) {
        this.stage = stage;
        this.next = null;
    }
}
