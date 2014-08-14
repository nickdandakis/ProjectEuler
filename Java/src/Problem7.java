import java.util.ArrayList;
import java.util.Scanner;

public class Problem7 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("nth prime number:");
		
		ArrayList<Integer> primes = Problem3.sieveErato(Integer.MAX_VALUE/50);
		System.out.println(primes.get(input.nextInt() - 1));
				
	}

}
