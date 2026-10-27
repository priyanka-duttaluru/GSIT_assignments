package daily;
/*
 * public class SecondLargestDebug {
    public static void main(String[] args) {
        int[] arr = {-5, -2, -9, -4};

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest
                    && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}


 */
public class SecondLargestElement {

	    public static void main(String[] args) {
	        int[] input1 = {-5, -2, -9, -4};
	        int[] input2 = {10, 10, 8, 5};
	        int[] input3 = {7, 7, 7};

	        runTest(input1);
	        runTest(input2);
	        runTest(input3);
	    }

	    public static void runTest(int[] arr) {
	        if (arr == null || arr.length < 2) {
	            System.out.println("Array must contain at least 2 elements.");
	            return;
	        }

	        int largest = arr[0];
	        // Fixed: Initialized to the absolute minimum integer possible
	        int secondLargest = Integer.MIN_VALUE; 

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > largest) {
	                secondLargest = largest;
	                largest = arr[i];
	            } else if (arr[i] > secondLargest && arr[i] != largest) {
	                secondLargest = arr[i];
	            }
	        }

	        System.out.println("Largest: " + largest);
	        // 5. Explicitly handle when no distinct second-largest element exists
	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("Second Largest: Does not exist");
	        } else {
	            System.out.println("Second Largest: " + secondLargest);
	        }
	        System.out.println("--------------------");
	    }
	}


