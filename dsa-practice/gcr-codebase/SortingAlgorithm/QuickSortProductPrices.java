public class QuickSortProductPrices {

    // Partition method
    public static int partition(int[] prices, int low, int high) {
        int pivot = prices[high]; 
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;

                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }
        
        // place pivot at correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

     // Quick Sort function
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pi = partition(prices, low, high);

            quickSort(prices, low, pi - 1);
            quickSort(prices, pi + 1, high);
        }
    }

    public static void main(String[] args) {
         int[] productPrices = {1200, 499, 899, 299, 1500};

        System.out.println("Before Sorting:");
        for (int price : productPrices) {
            System.out.print(price + " ");
        }

        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("\nAfter Sorting:");
        for (int price : productPrices) {
            System.out.print(price + " ");
        }
    }
}
