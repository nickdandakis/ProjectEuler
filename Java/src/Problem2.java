import java.io.IOException;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Sum of all even-valued fibonacci terms below:");
		
		long sum = sumOfEvenFib(input.nextInt());
		System.out.println(sum);

	}

	private static long sumOfEvenFib(int input) {
		long sum = 0;
		int i = 0;
		long fib;
		do{
			fib = fibGen2(i);
			if(fib % 2 == 0) {				
				//System.out.println(fib);
				sum += fib;
			}
			i++;
		}while(fib < input);
		return sum;
	}
	
	public static int fibGen(int n){
		if(n <= 2) return 1;
		else return fibGen(n - 1) + fibGen(n - 2);
	}
	
	public static int fibGen2(int n){
		int num, fi1 = 0, fi2 = 1;
        
        for(int i=0; i<n; i++)
        {
            num = fi1;
            fi1 = fi2;
            fi2 = num + fi2;
        }
        
        return fi1;
	}

}
