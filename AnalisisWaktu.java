public class AnalisisWaktu {

    // Iterative Binary Search
    public static int binarySearchIterative(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid overflow
            if (arr[mid] == target) {
                return mid; // Found
            }
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Not found
    }

    // Recursive Binary Search
    public static int binarySearchRecursive(int[] arr, int low, int high, int target) {
        if (low > high) {
            return -1; // Not found
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return mid; // Found
        }
        if (arr[mid] < target) {
            return binarySearchRecursive(arr, mid + 1, high, target);
        } else {
            return binarySearchRecursive(arr, low, mid - 1, target);
        }
    }

    public static void main(String[] args) {
        int[] data = new int[100000];
        for (int i = 0; i < data.length; i++) {
            data[i] = i; // Populate sorted array
        }
        int target = 54321;

        // Measure running time for iterative
        long startIterative = System.nanoTime();
        int resultIterative = binarySearchIterative(data, target);
        long endIterative = System.nanoTime();

        // Measure running time for recursive
        long startRecursive = System.nanoTime();
        int resultRecursive = binarySearchRecursive(data, 0, data.length - 1, target);
        long endRecursive = System.nanoTime();

        System.out.println("Iterative Result: " + resultIterative + ", Time: " + (endIterative - startIterative) + " ns");
        System.out.println("Recursive Result: " + resultRecursive + ", Time: " + (endRecursive - startRecursive) + " ns");
    }
}
