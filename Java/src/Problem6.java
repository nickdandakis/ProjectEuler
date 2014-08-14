import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Difference between the sum of the squares and the square of the sum of the first how many numbers?");
		int num = input.nextInt();
		
		System.out.println(squareSum(num) - sumSquares(num));
	}
	
	public static int sumSquares(int n){
		int sum = 0;
		
		for(int i=1; i<=n; i++){			
			sum += i * i;
		}
		return sum;
	}

	public static int squareSum(int n){
		int sum = 0;
		
		for(int i=1; i<=n; i++){
			sum += i;
		}
		return sum * sum;
	}
}
