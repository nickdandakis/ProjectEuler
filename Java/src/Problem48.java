import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;


public class Problem48 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Series 1 ^ 1 + 2 ^ 2 + 3 ^ 3 + 4 ^ 4 + ... + x ^ x.");
		System.out.print("x: ");
		System.out.println(summationBigIntegers(arrayNumberPowItself(input.nextInt())));

	}
	
	public static ArrayList<BigInteger> arrayNumberPowItself(int n){
		ArrayList<BigInteger> numbers = new ArrayList<BigInteger>();
		BigInteger term = BigInteger.ONE;
		
		for(int i = 1; i<n; i++){
			term = BigInteger.valueOf(i);
			numbers.add(term.pow(i));
		}
		
		return numbers;
	}
	
	public static BigInteger summationBigIntegers(ArrayList<BigInteger> numbs){
		BigInteger sum = BigInteger.ZERO;
		
		for(int i=0; i<numbs.size(); i++){
			sum = sum.add(numbs.get(i));
		}
		
		return sum;
	}

}
