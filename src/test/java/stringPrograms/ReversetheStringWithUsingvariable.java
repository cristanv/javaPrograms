package stringPrograms;

public class ReversetheStringWithUsingvariable {
	
	
	
	public static void main(String[] args) {
		String s="india";
		String rev="";  //"",a,ai,aid,aidn,aidni
		
		
		
		//       01234
		
		for(int i=s.length()-1;i>=0;i--) {
			// i=5-1=4  4>=0 3>=0 2>=0 1>=0 0>=0 -1>0
			
			rev=rev+s.charAt(i);
			
		}
			System.out.print(rev);// ""+a,a+i,ai+d,aid+n,aidn+i
		}
		

}
