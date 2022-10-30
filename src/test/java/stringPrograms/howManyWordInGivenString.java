package stringPrograms;

public class howManyWordInGivenString {

	public static void main(String[] args) {
		
		String s="javaseleniumjavajavapython"; //java 3
		String s1="java"; //
		int count=0;
		for (int i = 0; i <s.length(); i++) {
			
			for (int j = i+1; j <=s.length(); j++) {
				
				String p=s.substring(i, j);	
				
				if(s1.equals(p)) {
					count++;
				}			
			}
		}
		System.out.println(s1+" "+count);
	}
}
