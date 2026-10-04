package weekly;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
        int rev = 0;


        for (; n > 0; n = n / 10) {
            int rem = n % 10;
            rev = (rev * 10) + rem;
        }

        System.out.println("Reversed Number: " + rev);
  
	}

}
