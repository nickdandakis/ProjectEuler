import java.util.ArrayList;


public class Problem37 {
	static ArrayList<Integer> primes = Problem3.sieveErato(1000000);


	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=4; i<primes.size(); i++){
			if(isProperty(primes.get(i))) sum += primes.get(i);
		}
		
		System.out.println(sum);

	}
	
	public static boolean isProperty(int number){
		String strnumb = String.valueOf(number);
		boolean all = false;
		
		for(int i=0; i<strnumb.length(); i++){
			if(primes.contains(Integer.parseInt(strnumb.substring(0, strnumb.length()-i)))) all = true;
			else return false;
			if(primes.contains(Integer.parseInt(strnumb.substring(i, strnumb.length())))) all = true;
			else return false;
		}
		
		return all;
	}

}
