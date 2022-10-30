package practiceProgramJavaPrakashsir;

import java.util.Scanner;

public class nykaatwo {

	public static void main(String[] args) {
        int n, r = 0, num, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number=");
        n = s.nextInt();
        num = n;
        
        while (num > 4)
        {
        	
            while (num > 0)
            {
                r = num % 10;
                sum = sum + (r * r);
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1)
        {
            System.out.println("Happy Number");
        }
        else
        {
            System.out.println("Not Happy Number");
        }
    }


	}


