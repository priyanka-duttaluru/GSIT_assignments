package daily;

import java.util.Scanner;

public class Program_arrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        // Prompt user for the size of the array
		        System.out.print("Enter size of array:\n");
		        int size = scanner.nextInt();

		        // Initialize the array with the user-defined size
		        int[] numbers = new int[size];
		        int sum = 0;

		        // Loop to enter elements into the array
		        for (int i = 0; i < size; i++) {
		            System.out.print("Enter element " + (i + 1)+"\n ");
		            numbers[i] = scanner.nextInt();
		            
		            // Add the current element to the running total
		            sum += numbers[i];
		        }

		        // Output the final calculated sum
		        System.out.println("Sum:" + sum);

		        // Close the scanner resource
		        scanner.close();
	}

}
