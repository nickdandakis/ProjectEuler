import java.util.Scanner;


public class Problem5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Smallest number that is evenly divisible by all of the numbers from 1 to?");
		
		System.out.println(smallestDivByAll(input.nextInt()));

	}
	
	public static int smallestDivByAll(int n){
		int numb = n;
		
		for(int i=1; i<=n; i++){
			if(numb % i != 0) {
				i = 1;
				numb++;
			}
			
		}
		return numb;
	}

}
