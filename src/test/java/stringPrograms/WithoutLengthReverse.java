package stringPrograms;

public class WithoutLengthReverse {

	public static void main(String[] args) {
		String s="tyss";
		char[] s1 = s.toCharArray();
		int count= 0;
		
		for (char c : s1) {
			count++;
		}for (int i = count-1; i >=0; i--) {
			System.out.print(s.charAt(i));
		}

	}

}
