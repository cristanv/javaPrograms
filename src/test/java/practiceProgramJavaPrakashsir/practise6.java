package practiceProgramJavaPrakashsir;

public class practise6 {

	public static void main(String[] args) {
		
		String s="welcome to tyss bangalore"; //erolagnab to tyss emoclew 
		
		String str[]=s.split(" ");
		String temp=str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;
		
		for (int i = 0; i < str.length; i++) {
			String s1=str[i];
			
			if(i==0 || i==(str.length-1)) {
				
				for (int j =s1.length()-1; j>=0 ;j--) {
					System.out.print(s1.charAt(j));
					
				}
				System.out.print(" ");		
			}
			else {
				System.out.print(s1+" ");
			}
			
		}

	}

}
