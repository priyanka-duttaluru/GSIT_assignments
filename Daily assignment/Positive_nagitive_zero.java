package daily;

public class Positive_nagitive_zero {
    public static void main(String[] args) {
        // Original Input
        int[] arr = {-4, 7, 0, -2, 9, 0, -8, 5};
        
        System.out.println("Original Input Test Case:");
        separateAndPrint(arr);

        // Additional Test Cases
        System.out.println("\nAdditional Test Cases:");
        separateAndPrint(new int[]{0, -1, 2, 0, 3, -4});
        separateAndPrint(new int[]{-1, -2, -3});
        separateAndPrint(new int[]{1, 2, 3});
        separateAndPrint(new int[]{0, 0, 0});
    }

    public static void separateAndPrint(int[] arr) {
        int n = arr.length;
        
        // Requirements: Exactly three arrays
        int[] positives = new int[n];
        int[] negatives = new int[n];
        int[] zeros = new int[n];

        // Counter variables for insertion indices
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0; // Requirement: Only one counter variable for zeros

        // Single pass to distribute elements while maintaining original order
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positives[posCount] = arr[i];
                posCount++;
            } else if (arr[i] < 0) {
                negatives[negCount] = arr[i];
                negCount++;
            } else {
                zeros[zeroCount] = arr[i];
                zeroCount++;
            }
        }

        // Print final combined output sequence
        // 1. Positive numbers
        for (int i = 0; i < posCount; i++) {
            System.out.print(positives[i] + " ");
        }
        // 2. Negative numbers
        for (int i = 0; i < negCount; i++) {
            System.out.print(negatives[i] + " ");
        }
        // 3. Zeros
        for (int i = 0; i < zeroCount; i++) {
            System.out.print(zeros[i] + " ");
        }
        System.out.println(); // Newline
    }
}

