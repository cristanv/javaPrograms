package practiceProgramJavaPrakashsir;

import java.util.Scanner;

public class nykaprg {

	public static void main(String[] args) {
		
		Scanner s=new Scanner (System.in);
		System.out.println("enter the number :"); //16
		int n=s.nextInt();

		int sum=0,r;
		
		while(n>9){
		int sum1=0;
		
		while (n>0){
		   r=n%10;
		   sum=sum+(r*r);
		   n=n/10;
		}
		}
		if(n==1){
		 System.out.println("is happy number ");
		}
		else {
			System.out.println("not happy number");
		}
	  }
	}
  


