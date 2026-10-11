package daily;

public class Count_evenandodd_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={11, 24, 35, 44, 56, 67, 80, 93};
		int evencount=1;
		int oddcount=1;
		  for(int index=0;index<a.length;index++){
       	  if(a[index]%2==0) 
       		evencount++;
       	  else 
       		  oddcount++;
        	  
		  }
       	System.out.println("Even number="+evencount);
       	System.out.println("odd number=" +oddcount);
		  
		  
	}

}
