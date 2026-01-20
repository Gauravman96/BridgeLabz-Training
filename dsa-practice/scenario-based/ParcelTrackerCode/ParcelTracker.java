class ParcelTracker {

    private ParcelStage head;

    // Add stage at end
    public void addStage(String stage) {
        ParcelStage newNode = new ParcelStage(stage);

        if (head == null) {
            head = newNode;
            return;
        }

        ParcelStage temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add intermediate checkpoint after a given stage
    public void addCheckpointAfter(String existingStage, String newStage) {
        ParcelStage temp = head;

        while (temp != null) {
            if (temp.stage.equals(existingStage)) {
                ParcelStage checkpoint = new ParcelStage(newStage);
                checkpoint.next = temp.next;
                temp.next = checkpoint;
                return;
            }
            temp = temp.next;
        }

        System.out.println("Stage not found: " + existingStage);
    }

    // Track parcel forward
    public void trackParcel() {
        ParcelStage temp = head;

        if (temp == null) {
            System.out.println("Parcel lost or tracking unavailable.");
            return;
        }

        System.out.println("Parcel Tracking:");
        while (temp != null) {
            System.out.print(temp.stage);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
