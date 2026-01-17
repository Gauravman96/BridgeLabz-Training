import java.util.HashSet;

public class ChallengeProblem {

   //- Part 1 -
    public static int firstMissingPositive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (num > 0) {
                set.add(num);
            }
        }

        int i = 1;
        while (true) {
            if (!set.contains(i)) {
                return i;
            }
            i++;
        }
    }
            // -------- Part 2 --------
    public static int binarySearchTarget(int[] arr, int target) {

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
        public static void main(String[] args) {

        int[] arr = {3, 4, -1, 1};

        //  First Missing Positive
        int missing = firstMissingPositive(arr);
        System.out.println("First Missing Positive: " + missing);

        java.util.Arrays.sort(arr);

         int target = 4;
        int index = binarySearchTarget(arr, target);

        if (index != -1) {
            System.out.println("Target " + target + " found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
    }
}



