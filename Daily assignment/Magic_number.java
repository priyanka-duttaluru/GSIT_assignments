package daily;

public class Magic_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=272;
        int sum=0;
        int digitsum=0;
       
        for(;n>0;)
        {
        	int lastdigit=n%10;
        	sum=sum+lastdigit;
        	n=n/10;
        }
        System.out.println(sum);
        for(;sum>0;)
        {
        	int lastdigit1=sum%10;
        	digitsum=digitsum+lastdigit1;
        	sum=sum/10;
        }
        System.out.println(digitsum);
	
	if(digitsum==1) {
		System.out.println("Magic number");
		
	}
	else {
		System.out.println("Not a magic number");
		
	     }
	}
	

}
