import java.util.Scanner;

public class Problem14 {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Longest chain of the following sequence under x starting number.");
		System.out.println("n = n/2 (n is even)\nn = 3n + 1 (n is odd)");
		System.out.print("Starting number: ");
		
		System.out.println(chain(input.nextInt()));
		
	}
	
	public static long chain(int range) {
		int maxLength = 0;
		long startTerm = 0;
		int count = 0;
		long i = 0; 
		
		
		for(i=2; i<range; i++){
			long tempi = i;
			count++;
			
			while(!(i == 1)){
				if(i % 2 == 0) {
					i = i/2;
					count++;
				}
				else {
					i = (3*i) + 1;
					count++;				
				}
			}
			if(maxLength < count) {
				maxLength = count;
				startTerm = tempi;
			}
			
			count = 0;			
			i = tempi;
		}
		
		return startTerm;
	}

}
