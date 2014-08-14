import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Problem10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sum of primes below:");
		
		System.out.println(sumOfIntegers(Problem3.sieveErato(input.nextInt())));

	}

	public static long sumOfIntegers(ArrayList<Integer> ints) {
		Iterator<Integer> itr = ints.iterator();
		
		long sum = 0;
		while(itr.hasNext()){
			Integer numb = itr.next();
			//System.out.println(numb);
			sum += numb;
		}
		
		return sum;
	}

}
