import java.util.ArrayList;
import java.lang.Math;
import java.util.Scanner;


public class Problem12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("First triangle number that has more than n divisors.");
		System.out.print("n: ");
			
		System.out.println(findTriangNumbOverDiv(buildTriangNumbs(Integer.MAX_VALUE/100), input.nextInt()));

	}

	private static int findTriangNumbOverDiv(int[] numbs, int n) {
		ArrayList<Integer> divisors = new ArrayList<Integer>(1);
		int i = 0;
		
		for(i=1; divisors.size() < n; i++){
			divisors = findDivisors(numbs[i]);
		}
		
		//for(int j = 0; j < divisors.size(); j++){
		//	System.out.println("Divisor [" + j + "]: " + divisors.get(j));
		//}
		//System.out.println("Triangle number: " + numbs[i - 1]);
		//System.out.println("Divisors: " + divisors.size());
		return numbs[i-1];
	}
	
	public static int[] buildTriangNumbs(int n){
		int[] numbs = new int[n+1];
		numbs[0] = 0;
		int count = 0;
		
		for(int i=1; i<=n; i++){
			count += i;
			numbs[i] = count;
		}
		
		return numbs;
	}
	
	
	public static ArrayList<Integer> findDivisors(long numb){
		ArrayList<Integer> divisors = new ArrayList<Integer>();
		
		for(int i=1; i<Math.sqrt(numb); i++){
			if(numb % i == 0) {
				divisors.add(i);
				divisors.add((int) (numb/i));
			}
		}
		
		return divisors;
	}

}
