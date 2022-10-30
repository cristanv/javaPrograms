package practiceProgramJavaPrakashsir;

import java.util.Iterator;

public class printTimeOfCharacterOccurance {

	public static void main(String[] args) {
		
		String s="aabbbcabc";
		//outPut --> a2b3c1a1b1
		//        012345

		for(int i=0;i<s.length();i++) {
			int count=1;
			for(int j=i+1;j<s.length();j++) {
				 
				if(s.charAt(i)==s.charAt(j)) {
					count++;	
					i++;
				}
				else {
					break;
				}
				
			}
			System.out.print(s.charAt(i)+""+count);
			
		}
	}

}
