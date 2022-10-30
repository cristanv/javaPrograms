package ArrayProgram;

import java.util.Scanner;

public class primenumbersimple {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the number :");
		int n = s.nextInt();
		int count=1;
		
		for (int i = 1; i < n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("is a prime number");
		}
		else {
			System.out.println(" nothing");			
		}
	}

}
