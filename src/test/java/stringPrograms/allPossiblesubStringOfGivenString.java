package stringPrograms;

public class allPossiblesubStringOfGivenString {

	public static void main(String[] args) {
		
		String s="welcome";
		
//		for (int i = 0; i <s.length(); i++) {
//			String p=""; 
//			
//			for (int j = i; j < s.length(); j++) {
//				p=p+s.charAt(j);
//				System.out.println(p);			
//			}		
//		}
		
		//OR
		
		for (int i = 0; i <s.length(); i++) {
			for (int j = i+1; j <=s.length(); j++) {
				
				System.out.println(s.substring(i, j));			
			}		
		}
	}
}



