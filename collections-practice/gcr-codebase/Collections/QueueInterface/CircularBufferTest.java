class CircularBuffer {

    int[] arr;
    int size;
    int front = 0, rear = 0, count = 0;

    CircularBuffer(int size) {
        this.size = size;
        arr = new int[size];
    }

    void insert(int x) {
        arr[rear] = x;
        rear = (rear + 1) % size;

        if (count < size) {
            count++;
        } else {
            front = (front + 1) % size;
        }
    }

    void display() {
        int i = front;
        for (int c = 0; c < count; c++) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

public class CircularBufferTest {

    public static void main(String[] args) {

        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);

        cb.display();
    }
}
