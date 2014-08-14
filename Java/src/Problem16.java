import java.math.BigInteger;
import java.util.Scanner;


public class Problem16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sum of digits of the result of two to the power of n.");
		System.out.print("n: ");
		
		System.out.println(sumOfDigits(twoPowerOf(input.nextInt()).toString()));
	}
	
	public static int sumOfDigits(String numb) {
		int digit = 0, sum = 0;
		for(int i=0; i<numb.length(); i++){
			digit = Character.getNumericValue(numb.charAt(i));
			sum += digit;
		}
		return sum;
	}
	
	public static BigInteger twoPowerOf(int exp){
		BigInteger result = new BigInteger("2");
		result = result.pow(exp);
		return result;
	}

}
