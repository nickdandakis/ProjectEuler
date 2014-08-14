import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Problem3 {


	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Largest prime factor of the number:");

		System.out.println(largestPrimeFactor(input.nextLong()));
	}

	private static Integer largestPrimeFactor(long numb) {
		ArrayList<Integer> primes = sieveErato(30000);
		ArrayList<Integer> factors = new ArrayList<Integer>();
		
		int prime = 0;
		for (int i = 0; numb != 0 && i<primes.size(); i++) {
			prime = primes.get(i);
			if(numb % prime == 0){
				factors.add(prime);
				//System.out.println(prime);
				numb = numb / prime;
				i = 0;
			}			
		}
		
		return factors.get(factors.size() - 1);
	}

	public static ArrayList<Integer> sieveErato(int n){
		boolean[] N = new boolean[(n + 1)];
		for (int i = 2; i < n; i++) {
			N[i] = true;
		}
		ArrayList<Integer> prime = new ArrayList<Integer>();

		
		for(int i=2; i * i <= n; i++){
			if(N[i]){
				for(int j = i; i * j <= n; j++){
					N[i * j] = false;
				}
			}
		}
		
        for (int i = 2; i <= n; i++) {
            if (N[i]) prime.add(i);
        }
        		        
		return prime;
				
	}

}
