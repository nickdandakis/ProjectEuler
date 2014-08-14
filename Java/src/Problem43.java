
public class Problem43 {

	public static void main(String[] args) {
		long sum = 0;
		
		for(long i=1234567890L; i<=9876543210L; i++){
			if(isPandigital0to(String.valueOf(i)) && isProperty(i)){
				System.out.println(i);
				sum += i;
			}
		}
		
		System.out.println(sum);
	}

	public static boolean isProperty(long number){
		int[] prop = {2,3,5,7,11,13,17};
		String numb = String.valueOf(number);
		boolean all = false;
		
		for(int i=0; i<7; i++){
			if(Integer.parseInt(numb.substring(i+1,i+4)) % prop[i] == 0) all = true;
			else return false;
		}
		
		return all;
	}
	
	public static boolean isPandigital0to(String number){
		boolean[] digits = new boolean[number.length()];
		boolean all = false;
		int digit = 0;
		
		for(int i=0; i<number.length(); i++){
			digit = Integer.parseInt(String.valueOf(number.charAt(i)));
			if(digit >= number.length()) return false;
			else if(digits[digit] != true) digits[digit] = true;
			else return false;
		}
		
		for(int i=0; i<digits.length; i++){
			if(digits[i] == true) all = true;
			else return false;
		}
		
		return all;
	}
}
