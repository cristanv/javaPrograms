package practiceProgramJavaPrakashsir;

import java.util.Scanner;

public class PrimeNUmber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter the number :");
		int n = s.nextInt();
		
		int count=0,i=1;
		
		while(i<=n) {
			if(n%i==0) {
				count++;
			}
			i++;
		}
		if(count==2) {
			System.out.println("is prime number");
		}
		else {
			System.out.println("is not prime number");
		}	
	}
}
