package stringPrograms;

import java.util.LinkedHashSet;

public class printPossiblesubStringOfGivenStringonlyTwoRemoveDupicate {

	public static void main(String[] args) {
		
		
	String s="welcomecome";  //[we, el, lc, co, om, me, ec]
		
	LinkedHashSet<String> set=new LinkedHashSet<String>();
		for (int i = 0; i <s.length(); i++) {	
		for (int j = i+1; j <=s.length(); j++) {
			
			String p=s.substring(i, j);		
			if(p.length()==2) {
				set.add(p);					
			}					
		}
	}
		System.out.println(set);

	}

}
