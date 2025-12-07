public class GrafikRunningTime {

    public static void printGraph(int[] inputSizes, long[] timesIterative, long[] timesRecursive) {
        System.out.println("Binary Search Running Time (Iterative vs Recursive):");
        System.out.println("Input Size\tIterative (ns)\tRecursive (ns)");

        // Print data and plot ASCII graph
        for (int i = 0; i < inputSizes.length; i++) {
            System.out.printf("%-12d\t%-15d\t%-15d\n", inputSizes[i], timesIterative[i], timesRecursive[i]);
            System.out.print("Iterative: ");
            for (int j = 0; j < timesIterative[i] / 100000; j++) {
                System.out.print("*");
            }
            System.out.println();

            System.out.print("Recursive: ");
            for (int j = 0; j < timesRecursive[i] / 100000; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        // Example input sizes and running times
        int[] inputSizes = {100, 1000, 10000, 100000};
        long[] timesIterative = {10000, 50000, 120000, 300000};
        long[] timesRecursive = {15000, 60000, 140000, 400000};

        printGraph(inputSizes, timesIterative, timesRecursive);
    }
}
