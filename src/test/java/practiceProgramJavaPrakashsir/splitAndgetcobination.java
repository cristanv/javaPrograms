package practiceProgramJavaPrakashsir;

public class splitAndgetcobination {

	public static void main(String[] args) {
		
		String s="abc";
		s=s+"xyz";
		// o/p = axbycz
		// a b c x y z
		// 0 1 2 3 4 5
		
		int n=s.length()/2;
		for (int i = 0; i < n; i++) {
			System.out.print(s.charAt(i)+""+s.charAt(i+n));	//axbycz
			                    //abc           //x y z	
		}
	}
}