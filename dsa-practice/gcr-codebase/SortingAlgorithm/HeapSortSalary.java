public class HeapSortSalary {

    public static void heapify(int[] salary, int n, int i) {
        int largest = i;        // root
        int left = 2 * i + 1;   // left child
        int right = 2 * i + 2;  // right child

        // If left child is larger than root
        if (left < n && salary[left] > salary[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && salary[right] > salary[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int temp = salary[i];
            salary[i] = salary[largest];
            salary[largest] = temp;

            // Recursively heapify affected subtree
            heapify(salary, n, largest);
        }
    }

    // Heap Sort method
    public static void heapSort(int[] salary) {
        int n = salary.length;

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salary, n, i);
        }

        // Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = salary[0];
            salary[0] = salary[i];
            salary[i] = temp;

            // Call heapify on reduced heap
            heapify(salary, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] salaryDemands = {60000, 45000, 80000, 50000, 70000};

        System.out.println("Before Sorting:");
        for (int s : salaryDemands) {
            System.out.print(s + " ");
        }

        heapSort(salaryDemands);

        System.out.println("\nAfter Sorting:");
        for (int s : salaryDemands) {
            System.out.print(s + " ");
        }
    }
}
