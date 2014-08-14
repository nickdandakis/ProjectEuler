import java.math.BigInteger;
import java.util.Scanner;


public class Problem20 {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sum of digits of the result of n!.");
		System.out.print("n: ");
		
		System.out.println(Problem16.sumOfDigits(factorial(input.nextInt()).toString()));
	}
	
	public static BigInteger factorial(int n){
		BigInteger fact = BigInteger.ONE;
		
		for(int i=n; i>0; i--){
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		
		return fact;
	}

}
