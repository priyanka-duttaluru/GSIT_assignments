package weekly;

public class Count_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n = 987654;
	        int count = 0;

	        for (; n > 0; n = n / 10) {
	            count++; 
	        }

	        System.out.println("Number of digits: " + count);
	}

}
