package ArrayProgram;

import java.util.Scanner;

public class FindPrimeNumberInArrayCondition {

	public static void main(String[] args) {
			
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = s.nextInt();
	
		//int n=7;
		int i=2;
		
		while (n>0) {
			
			if(n%i==0) {
				break;
			}
			else {
				i++;
			}	
		}
		if(n==i) {
			System.out.println("number is prime number");
		}
		else {
			System.out.println("number is not prime");
		}
	}
}
