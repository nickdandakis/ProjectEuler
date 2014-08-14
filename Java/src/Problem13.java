import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;


public class Problem13 {


	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Sum of very big numbers.");
		System.out.print("Input filename: ");
		Scanner input = new Scanner(System.in);
		String filename = input.nextLine();

		System.out.println(sumOfLines(filename));
		

	}
	
	public static BigInteger sumOfLines(String filename) throws FileNotFoundException{
		File file = new File(filename);
		Scanner scan = new Scanner(file);
		BigInteger sum = BigInteger.ZERO;
		BigInteger numb = BigInteger.ZERO;
		
		while(scan.hasNext()){
			numb = new BigInteger(scan.nextLine());
			sum = sum.add(numb);
		}
		
		return sum;
	}

}
