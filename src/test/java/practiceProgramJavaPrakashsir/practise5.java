package practiceProgramJavaPrakashsir;

public class practise5 {

	public static void main(String[] args) {
		
		String s="a2b3c1a2";
		
		for (int i = 0; i < s.length()-1; ) {
			int n = s.charAt(i+1)-48;
			
			while(n>0) {
				System.out.print(s.charAt(i));
				n--;
			}
			i=i+2;
		}
	}
}
