package practiceProgramJavaPrakashsir;

import java.util.LinkedHashSet;

public class ocuranceForEachWord {

	public static void main(String[] args) {
		

		String s="welcome home home"; //welcome1home2
		String[] str=s.split(" ");
		
		
		//step 1
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		 for(int i=0;i<str.length;i++) {
			
			 set.add(str[i]); //i n d i a
			// System.out.println(set);
		 }
		 
		 //step 2
		 for(String word:set) {  //india
			 //ch=a
			 int count=0;
			 
			 for(int i=0;i<str.length;i++) {
				 //i=0 0<5 1<5 2<5 3<5 4<5 5<5
				 if(word.equals(str[i])) {
					 //n==1, n==n,n==d,n==i,n==a
					 //step 3
					 count++;
				 }	 
			 }
			 //step 4
			 System.out.print(word+""+count);
			 
		 }
		

	}

}
