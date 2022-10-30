package ArrayProgram;

public class sumOfTwoArrays {

	public static void main(String[] args) {
		
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < b.length; j++) {
				System.out.print(a[i]+b[j]+" ");
				break;
			}	
		}
	}
}
