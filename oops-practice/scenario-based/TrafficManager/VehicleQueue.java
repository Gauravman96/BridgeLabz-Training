class VehicleQueue {
    String[] queue;
    int front = 0, rear = -1, size, capacity;

    VehicleQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(String vehicle) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot add " + vehicle);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = vehicle;
        size++;
        System.out.println( " " + vehicle + " added to waiting queue");
    }

    String dequeue() {
        if (isEmpty()) {
            System.out.println(" Queue Underflow! No vehicle waiting");
            return null;
        }
        String vehicle = queue[front];
        front = (front + 1) % capacity;
        size--;
        return vehicle;
    }
}
