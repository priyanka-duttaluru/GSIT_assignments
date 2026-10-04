package weekly;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1221;
        int original = number;
        int reversed = 0;

        for (int i = number; i > 0; i = i / 10) {
            int remainder = i % 10;
            reversed = (reversed * 10) + remainder;
        }
        if (reversed == original) {
            System.out.println(original + " is a palindrome number.");
        } else {
            System.out.println(original + " is NOT a palindrome number.");
        }
	}

}
