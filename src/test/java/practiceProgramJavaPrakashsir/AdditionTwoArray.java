package practiceProgramJavaPrakashsir;

public class AdditionTwoArray {

	public static void main(String[] args) {
		int a[]= {1,3,4};
		int b[]= {6,7,8,9};
		
		int count=a.length;
		if(a.length<b.length) {
			count=b.length;
		}
		for (int i = 0; i < count; i++) {
			try {
				System.out.println(a[i]+b[i]);
			}
			catch (Exception e) {
				if(a.length>b.length) {
					System.out.println(a[i]);
				}
				else {
					System.out.println(b[i]);
				}
			}
			
		}
		
		

	}

}
