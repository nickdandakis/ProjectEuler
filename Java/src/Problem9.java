import java.util.Scanner;

public class Problem9 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Product of a, b and c in Pythagorean Triplet for the number:");
		
		System.out.println(productOfInts(findPythTriplet(input.nextInt())));

	}

	private static int productOfInts(int[] result) {
		int product = 1;
		
		for(int i=0; i<result.length; i++){
			product *= result[i];
			System.out.println(result[i]);
		}
		return product;
	}
	
	public static boolean checkPyth(int a, int b, int c){
		int sumOfSquares = (a*a) + (b*b);
		if(sumOfSquares == (c*c)) return true;
		else return false;
	}
	
	public static int[] findPythTriplet(int sum){
		int[] triplet = new int[3];
		for(int i=1; i<sum; i++){
			for(int j=1; j<sum; j++){
				triplet[0] = i;
				triplet[1] = j;
				triplet[2] = sum - (triplet[0]+triplet[1]);
				if(checkPyth(triplet[0], triplet[1], triplet[2])) {
					return triplet;
				}
			}
		}
		return triplet;
	}

}
