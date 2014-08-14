import java.io.IOException;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Sum of all multiples of 3 and 5 below:");
		
		System.out.println(mult35(input.nextInt()));
	}
	
	public static int mult35(int n){
		int sum = 0;
		for(int i=0; i<n; i++){
			if(i % 3 == 0 || i % 5 == 0) sum += i;			
		}
		return sum;
	}

}