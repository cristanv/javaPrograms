package practiceProgramJavaPrakashsir;

public class prac {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7};
		
		
		for (int i = 0; i < a.length; i++) {
			    int n = a[i];
			    int j=2;
			    
			    while(n>0) {
			    	if(n%j==0) {
			    		break;
			    	}
			    	else {
						j++;
					}
			    }
			    if(n==j) {
			    	System.out.println(a[i]);
			    }    
		} 
	}

}
