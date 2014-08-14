import java.util.ArrayList;


public class Problem41 {


	public static void main(String[] args) {
		ArrayList<Integer> primes = Problem3.sieveErato(30000000);
		
		for(int i=0; i<primes.size(); i++){
//			System.out.print(primes.get(i) + " " + i);
			if(isPandigital1to(String.valueOf(primes.get(i)))) System.out.println(primes.get(i));
//			else System.out.println(" FALSE");
		}

	}
	
	public static boolean isPandigital1to(String number){
		boolean[] digits = new boolean[number.length()];
		boolean all = false;
		int digit = 0;
		
		for(int i=0; i<number.length(); i++){
			digit = Integer.parseInt(String.valueOf(number.charAt(i))) - 1;
			if(digit >= number.length()) return false;
			else if(digit == -1) return false;
			else digits[digit] = true;
		}
		
		for(int i=0; i<digits.length; i++){
			if(digits[i] == true) all = true;
			else{
				all = false;
				break;
			}
		}
		
		return all;
	}

}
