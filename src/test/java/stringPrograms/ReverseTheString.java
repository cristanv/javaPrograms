package stringPrograms;

public class ReverseTheString {

	public static void main(String[] args) {
		String s="testyantra";
		for (int i = s.length()-1; i >=0 ; i--) {
			
			System.out.print(s.charAt(i));	
		}
	}
}
