package practiceProgramJavaPrakashsir;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n = s.nextInt();
		
		int a=0,b=1,c;
		
		for (int i = 0; i < n; i++) {
			
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
