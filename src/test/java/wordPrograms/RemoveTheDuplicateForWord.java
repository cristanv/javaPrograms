package wordPrograms;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateForWord {

	public static void main(String[] args) {
		

		String s="welcome home";
		String[] str=s.split(" ");
		//step 1:
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		 for(int i=0;i<str.length;i++) {
		
			 set.add(str[i]); 
		 }
		 //step 2:
		 for (String word : set) {
			 System.out.println(word); //inda	
		}


	}

}
