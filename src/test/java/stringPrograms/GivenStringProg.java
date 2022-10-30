package stringPrograms;

public class GivenStringProg {

	public static void main(String[] args) {
		
		String s="india";
		//output i
	   //        in
		//       ind
		//       indi
		//       india
		
		String a="";
		
		
		for (int i = 0; i <s.length(); i++) {
			a=a+s.charAt(i);
			System.out.println(a);
			
		}
		           
	}

}
