import java.lang.Math;

public class Problem30 {

	public static void main(String[] args) {
		String term; int sum = 0; int totalSum = 0;
		
		for(int i=10; i<300000; i++){
			term = String.valueOf(i);
			for(int j=0; j<term.length(); j++){
				sum += Math.pow(Integer.parseInt(term.substring(j,j+1)), 5);
			}
			if(sum == i) totalSum += i;
			sum = 0;
		}
		
		System.out.println(totalSum);
		
	}
}