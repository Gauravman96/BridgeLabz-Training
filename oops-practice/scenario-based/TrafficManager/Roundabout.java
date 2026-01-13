class Roundabout {
    Vehicle head = null;
    int count = 0;
    int capacity;

    VehicleQueue waitingQueue;

    Roundabout(int capacity, int queueCapacity) {
        this.capacity = capacity;
        waitingQueue = new VehicleQueue(queueCapacity);
    }

    // Add vehicle
    void addVehicle(String number) {
        if (count == capacity) {
            waitingQueue.enqueue(number);
            return;
        }

        Vehicle newVehicle = new Vehicle(number);

        if (head == null) {
            head = newVehicle;
            newVehicle.next = head;
        } else {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newVehicle;
            newVehicle.next = head;
        }
        count++;
        System.out.println(" Vehicle " + number + " entered roundabout");
    }

    // Remove vehicle
    void removeVehicle(String number) {
        if (head == null) {
            System.out.println(" Roundabout empty");
            return;
        }

        Vehicle curr = head, prev = null;

        do {
            if (curr.number.equals(number)) {

                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) {
                        Vehicle last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        head = head.next;
                        last.next = head;
                    } else {
                        prev.next = curr.next;
                    }
                }

                count--;
                System.out.println(" Vehicle " + number + " exited roundabout");

                // Allow waiting vehicle to enter
                String nextVehicle = waitingQueue.dequeue();
                if (nextVehicle != null) {
                    addVehicle(nextVehicle);
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Vehicle not found");
    }

    //  Print roundabout
    void printRoundabout() {
        if (head == null) {
            System.out.println(" Roundabout empty");
            return;
        }

        Vehicle temp = head;
        System.out.print("🔄 Roundabout: ");
        do {
            System.out.print(temp.number + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}
