package group5;

public class AddNumAndStoreAsDigit {

	public static void main(String[] args) {
		
        int[] a={1,2,2,4,7};
		
		int[] b={6,9,1,2};
		
		 int count= a.length;
		
		  if(b.length>a.length)
		   {
			count=b.length;
		   }
		
		for (int i = 0; i < count; i++) 
		{
			 
	   try{
		 int c = a[i]+b[i];
				 
			 if(c<9)
			 {
				 System.out.println(c);
				 
			 }
			 else
			 {	 
				 int x= c%10;
				 System.out.println(x);
				 int y =c/10;
				 System.out.println(y);
			 }		
		}
     catch(Exception e){
					
    	 if(b.length>a.length)
					{
						System.out.println(b[i]);
					}
    	 else
					{
						System.out.println(a[i]);
					}
				}	 
		}
	}

}
