package stringPrograms;

public class printPossiblesubStringOfGivenStringonlyTwo {

	public static void main(String[] args) {
		
		String s="welcome";
//		we
//		el
//		lc
//		co
//		om
//		me
		
		for (int i = 0; i <s.length(); i++) {
		for (int j = i+1; j <=s.length(); j++) {
			
			String p=s.substring(i, j);
			if(p.length()==2) {
				System.out.println(p);			
			}					
		}		
	}

	}
}
