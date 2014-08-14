import java.math.BigInteger;
import java.util.Scanner;


public class Problem25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Find fibonnaci number length x.");
		System.out.print("x: ");
		
		System.out.println(findFib(input.nextInt()));
	}
	
	public static BigInteger fibonacci(int n){
		BigInteger temp = BigInteger.ZERO;
		BigInteger fib = BigInteger.ZERO;
		BigInteger nextfib = BigInteger.ONE;
		
		for(int i=0; i<n; i++){
			temp = fib;
			fib = nextfib;
			nextfib = temp.add(fib);
		}
		
		return fib;
	}
	
	public static BigInteger findFib(int length){
		BigInteger numb = BigInteger.ONE;
		String strnumb = "1";
		int i;
		
		for(i=1; strnumb.length() != length; i++){
			numb = fibonacci(i);
			strnumb = numb.toString();			
		}
		System.out.println("Fibonnaci term [" + (i-1) + "]:");
		return numb;
	}

}
