package practiceProgramJavaPrakashsir;

import java.util.LinkedHashSet;

public class RemoveTheDuplicates {

	public static void main(String[] args) {
		
		String s="indiaan";
		
		
		//step 1:
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		 for(int i=0;i<s.length();i++) {
			 // i=0 0 ,5 1<5 2<5 3<5 4<5 5<5
			 set.add(s.charAt(i)); //i n d i a
		 }
		 //step 2:
		 for (Character ch : set) {
			 System.out.print(ch); //inda
			
		}

	}

}
