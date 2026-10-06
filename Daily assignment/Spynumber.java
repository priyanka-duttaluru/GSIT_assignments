package daily;

public class Spynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=22;
      int sum=0;
      int product=1;
      for(;n>0;)
 {
	 int lastdigit=n%10;
	 sum=sum+lastdigit;
	 product=product*lastdigit;
	 n=n/10;
	 
 }
      System.out.println(sum);
      
    
      System.out.println(product);
      if(sum==product)
      {
    	  
    	  System.out.println("Spy number");
      }
      else
      {
    	  System.out.println("not spy number"); 
      }
	}

}
