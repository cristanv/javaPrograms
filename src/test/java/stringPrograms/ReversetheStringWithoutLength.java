package stringPrograms;

public class ReversetheStringWithoutLength {
	
	
	public static void main(String[] args) {
		
		String s="india";
          //      01234
		String rev="";  //"",a,ai,aid,aidn,aidni
		int count=s.compareTo(rev);  //5
		
		
		for(int i=count-1;i>=0;i--) {
			// i=5-1=4  4>=0 3>=0 2>=0 1>=0 0>=0 -1>0
			
			rev=rev+s.charAt(i);
			
		}
			System.out.print(rev);// ""+a,a+i,ai+d,aid+n,aidn+i
		}

}
