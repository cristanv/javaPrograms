package practiceProgramJavaPrakashsir;

import java.util.Iterator;

public class MissingNumber {

	public static void main(String[] args) {
		int[] a= {1,3,4,5,6,7,8}; 
		//1+2+4+5=12
		//1+2+3+4+5=15
		//sum2-sum1 15-12=3 missing
		
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i]; //12
		}
		System.out.println("sum of elements :"+sum1);
		
		int sum2=0;
		for (int i = 1; i <=8; i++) {
			sum2=sum2+i;	
		}
		System.out.println("sum of range elements :"+sum2);
		
		int p = sum2-sum1;
		System.out.println("missing number is :"+p);	
		
  } 
	
}


