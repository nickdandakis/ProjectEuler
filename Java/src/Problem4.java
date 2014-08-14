import java.util.Scanner;
import java.lang.Math;

public class Problem4 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Largest palindrome made from the product of how many digit number?");
		
		calcLargest(input.nextInt());
	}

	public static void calcLargest(int ndigits)
    {
        int product = 0;
        int maxprd = 0;
        int n = (int) Math.pow(10, ndigits);
        
        for(int i=1; i<n; i++){
            for(int j=1; j<n; j++){
                product = i * j;
                if(checkPali(product) == true){
                    if(maxprd < product) maxprd = product;
                    System.out.println("i: " + i + ", j: " + j + ", product: " + product);
                    System.out.println("Max product: " + maxprd);
                }
            }
        }
    }
    
    public static boolean checkPali(int product)
    {
        Integer intproduct = new Integer(product);
        String strproduct = intproduct.toString();
        
        int left = 0;
        int right = strproduct.length() - 1;
        
        while(left < right){
            if(strproduct.charAt(left) != strproduct.charAt(right)) return false;
            left++;
            right--;
        }
        
        return true;
    }
}