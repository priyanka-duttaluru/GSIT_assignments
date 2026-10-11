package daily;

public class Skip_Even_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=1;
    	 do {
             if(n>15) {
                 break; // Stop the loop when the number becomes greater than 15
             }

             if(n%2==0) {
                 n++;
                 continue; // Skip all even numbers
             }

             System.out.print(n+ "\n");
             n++;
         } while(n<=17);
	}

}
