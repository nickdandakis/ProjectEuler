import java.util.ArrayList;


public class Problem23 {

	public static void main(String[] args) {

	}
	
	public static ArrayList<Integer> buildAbundantNumbers(int range){
		ArrayList<Integer> divisors = new ArrayList<Integer>();
		ArrayList<Integer> abundant = new ArrayList<Integer>();
		
		for(int i=12; i<range; i++){
			divisors = Problem12.findDivisors(i);
			divisors.remove(1);
			if(findSum(divisors) > i) abundant.add(i);
			divisors.clear();
		}
		
		return abundant;
	}
	
	public static int findSum(ArrayList<Integer> numbs){
		int sum = 0;
		
		for(int i=0; i<numbs.size(); i++){
			sum += numbs.get(i);
		}
		
		return sum;
	}

}
