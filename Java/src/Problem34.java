
public class Problem34 {


	public static void main(String[] args) {
		long range = 100000;
		String strVal; long sum = 0;
		
		for(int i=10; i<range; i++){
			strVal = String.valueOf(i);
			
			for(int j=0; j<strVal.length(); j++){
				sum += Problem24.fact(Integer.parseInt(String.valueOf(strVal.charAt(j))));
			}
			
			if(sum == i) System.out.println(i);
			sum = 0;
		}
	}
	
	

}
