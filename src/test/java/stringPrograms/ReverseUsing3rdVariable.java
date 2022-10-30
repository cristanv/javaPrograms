package stringPrograms;

public class ReverseUsing3rdVariable {

	public static void main(String[] args) {
		String s= "welcome to tyss";
		String rev= "";
		
		for (int i = s.length()-1; i >=0; i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(s)){
			System.out.println("The Given String is Palindrome");
		}

	}
	

}
