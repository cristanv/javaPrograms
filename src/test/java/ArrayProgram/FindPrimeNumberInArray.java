package ArrayProgram;

public class FindPrimeNumberInArray {

	public static void main(String[] args) {
		
		int[] a= {2,6,7,9,5,3,10};
		
		for (int i = 0; i < a.length; i++) {
			
			int n = a[i];
			int j = 2;
			
			while (n>0) {
				
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
