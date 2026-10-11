package daily;

import java.util.Arrays;

public class Duplicate_elements_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int []numbers= {10, 20, 30, 20, 40, 10, 50, 30, 60};
     Arrays.sort(numbers);
     
     System.out.print("Duplicate elements: ");

     // Single loop to find duplicates side-by-side
     for (int i = 0; i < numbers.length - 1; i++) {
         // Check if the current number matches the next one
         if (numbers[i] == numbers[i + 1]) {
             System.out.print(numbers[i] + " ");
             
             // Skip past any extra copies so we only print it once
             while (i < numbers.length - 1 && numbers[i] == numbers[i + 1]) {
                 i++;
             }
         }
     }
	}

}
