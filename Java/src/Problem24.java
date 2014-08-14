import java.util.ArrayList;


public class Problem24 {


	public static void main(String[] args) {
		int[] digits = {0,1,2,3,4,5,6,7,8,9};
		ArrayList<int[]> perms = permutate(digits);
		
		
	}
	
	public static ArrayList<int[]> permutate(int[] digits){
		ArrayList<int[]> permutations = new ArrayList<int[]>();
		
		for(int i=0; i<fact(digits.length); i++){
			
		}
		return permutations;
	}
	
	public static int fact(int x){
		int fact = 1;
		
		for(int i=x; i>0; i--){
			fact  *= i;
		}
		
		return fact;
	}

}
