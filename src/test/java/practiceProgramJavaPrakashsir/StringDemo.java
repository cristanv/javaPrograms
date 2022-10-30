package practiceProgramJavaPrakashsir;

public class StringDemo {

	public static void main(String[] args) {
		
		String s="aabb";
		
		// o/p== abab
		
		int n=s.length()/2;
		for (int i = 0; i < n; i++) {
			System.out.print(s.charAt(i)+""+s.charAt(i+n));	//abab
		}
	}
}
