package practiceProgramJavaPrakashsir;

import java.util.LinkedHashSet;

public class NumberOfOccuranceEachCharReversOrder {

	public static void main(String[] args) {
		
		

		String s="Tester";
		//output r6,e5,t4,s3
		
		s=s.toLowerCase();
		System.out.println(s);
		//step 1
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		 for(int i=s.length()-1;i>=0;i--) {
			 
			 set.add(s.charAt(i)); //i n d i a
		 }
		 
		 //step 2
			 //ch=a
			for(Character ch: set) {
			 
			 for(int i=s.length()-1;i>=0;i--) {
				
				 if(ch==s.charAt(i)) {
					
					System.out.println(ch+"="+(i+1));
					break;
				 }	 
			 }

	     }

	}
}
