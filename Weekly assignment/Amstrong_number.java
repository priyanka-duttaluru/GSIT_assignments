package weekly;

public class Amstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n = 153;
	        int original = n;
	        int sum = 0;

	        
	        /*
	           for (int i = number; i > 0; i = i / 10) {
            digits++;
        }

        // Step 2: Calculate the sum of each digit raised to the power of digits
        for (int i = number; i > 0; i = i / 10) {
            int remainder = i % 10;
            sum += Math.pow(remainder, digits);
        }
	         */
	        // Loop through each digit
	        for (; n> 0; n = n / 10) {
	            int remainder = n % 10;
	            sum = sum + (remainder * remainder * remainder);
	        }

	        // Check if the sum matches the starting number
	        if (sum == original) {
	            System.out.println(original + " is an Armstrong number.");
	        } else {
	            System.out.println(original + " is NOT an Armstrong number.");
	        }
	      
	}

}
