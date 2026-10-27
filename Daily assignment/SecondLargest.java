package daily;

/*public class SecondLargest {

	    public static void main(String[] args) {
	        int[] arr = {0, 0, 0, 0, 0};

	        int largest = -1;
	        int secondLargest = -1;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > largest) {
	                secondLargest = largest;
	                largest = arr[i];
	            } else if (arr[i] > secondLargest
	                    && arr[i] != largest) {
	                secondLargest = arr[i];
	            }
	        }

	        System.out.println("Second Largest: " + secondLargest);
	    }
	}
*/
public class SecondLargest {
    public static void main(String[] args) {
        // Test array with zeros
        int[] arr1 = {0, 0, 0, 0, 0};
        // Test array with negative numbers
        int[] arr2 = {-5, -12, -3, -8};

        printSecondLargest(arr1);
        printSecondLargest(arr2);
    }

    public static void printSecondLargest(int[] arr) {
        // Fixed: Initialized to the absolute minimum integer possible
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        // 5. Handling case where all elements are equal or array is too small
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second Largest: Does not exist (all elements equal)");
        } else {
            System.out.println("Second Largest: " + secondLargest);
        }
    }
}


