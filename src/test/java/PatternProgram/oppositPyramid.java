package PatternProgram;

public class oppositPyramid {

	public static void main(String[] args) {
		
	for (int i = 1; i <=4; i++) {
			
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
			      }
				for (int k = 1; k <=4-i; k++) {
					System.out.print("* ");
					
				}
				System.out.print("\n");
				
			}
		}

	}


