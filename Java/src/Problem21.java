import java.util.ArrayList;
import java.util.Scanner;


public class Problem21 {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sum of all amicable numbers under: ");
		ArrayList<Long> amicables = findAmicables(input.nextInt());
		int sum = 0;
		
		for(int i = 0; i<amicables.size(); i++){
			sum += amicables.get(i);
			System.out.println(amicables.get(i));
		}
		
		System.out.println(sum);
		
	}

	private static ArrayList<Long> findAmicables(int n) {
		long sumi = 0;
		long sumj = 0;
		ArrayList<Long> amicables = new ArrayList<Long>();
		ArrayList<Integer> divisorsi = new ArrayList<Integer>();
		ArrayList<Integer> divisorsj = new ArrayList<Integer>();
		
		for(long i = 10; i<n; i++){
			//find divisors of i
			divisorsi = Problem12.findDivisors(i);
			divisorsi.remove(1);
			//find sum of divisors
			sumi = Problem10.sumOfIntegers(divisorsi);
			//find divisors of sum
			divisorsj = Problem12.findDivisors(sumi);
			divisorsj.remove(1);
			//find sum of divisors
			sumj = Problem10.sumOfIntegers(divisorsj);
			//check if i == sum of divisors
			if(i == sumj && i != sumi) {
				amicables.add(i);
				amicables.add(sumi);
				i = sumi;
			}
		}
		return amicables;
	}
	
}
