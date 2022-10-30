package stringPrograms;

public class sumEachdigitsinAgivenString {

	public static void main(String[] args) {
		
		String s="a1b@2c1111";
		//Output should= 10
		
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				int n=s.charAt(i)-48;
				sum=sum+n;
			}
		}
		System.out.println(sum);
		

	}

}
