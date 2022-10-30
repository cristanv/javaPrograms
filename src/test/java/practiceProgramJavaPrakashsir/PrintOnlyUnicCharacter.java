package practiceProgramJavaPrakashsir;

import java.util.LinkedHashSet;

public class PrintOnlyUnicCharacter {

	public static void main(String[] args) {
		
		String s="india";  //nda
		//1=2 n=1 d=1 a=1
		
		//step 1
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		 for(int i=0;i<s.length();i++) {
			 // i=0 0 ,5 1<5 2<5 3<5 4<5 5<5
			 set.add(s.charAt(i)); //i n d i a
			// System.out.println(set);
		 }
		 
		 //step 2
		 for(Character ch:set) {  //india
			 //ch=a
			 int count=0;
			 
			 for(int i=0;i<s.length();i++) {
				 //i=0 0<5 1<5 2<5 3<5 4<5 5<5
				 if(ch==s.charAt(i)) {
					 //n==1, n==n,n==d,n==i,n==a
					 //step 3
					 count++;
				 }	 
			 }
			 //step 4
			 if(count==1)
			 System.out.print(ch);  //nda
			 
		 }

	}

}
