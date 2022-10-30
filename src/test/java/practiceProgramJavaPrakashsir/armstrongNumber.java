package practiceProgramJavaPrakashsir;

import java.util.Scanner;

public class armstrongNumber {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter number:");
		int n = s.nextInt();
		
		int sum=0,r,t=n;
		
		while(n>0) {
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(t==sum) {
			System.out.println(" is a Armstrong number");
		}
		else {
			System.out.println("not a Armstrong number");
		}

	}

}
