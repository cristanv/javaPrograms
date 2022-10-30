package wordPrograms;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicateValueGivenWord {

	public static void main(String[] args) {
		
		
		String s="welcome home";
		String[] str=s.split(" ");
		
		//step 1:
				LinkedHashSet<String> set=new LinkedHashSet<String>();
				
				 for(int i=0;i<str.length;i++) {
					 // i=0 0 ,5 1<5 2<5 3<5 4<5 5<5
					 set.add(str[i]); //i n d i a
				 }
				 //step 2
				 for(String word:set) {  //india
					 //ch=a
					 int count=0;
					 
					 for(int i=0;i<str.length;i++) {
						 //i=0 0<5 1<5 2<5 3<5 4<5 5<5
						 if(word==str[i]) {
							
							 count++;
						 }	 
					 }
					 //step 4
					 if(count>1)
					 System.out.print(word+""+count);
					 
				 }
	}

}
