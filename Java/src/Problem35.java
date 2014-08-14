import java.util.ArrayList;


public class Problem35 {

	static ArrayList<Integer> primes = Problem3.sieveErato(1000000);
	
	public static void main(String[] args) {
		ArrayList<Integer> result = findCircularPrimes();
		
		System.out.println(result.size());

	}
	
	public static ArrayList<Integer> findCircularPrimes(){
		ArrayList<Integer> circularPrimes = new ArrayList<Integer>();
		String numb;
		
		for(int i=0; i<primes.size(); i++){
			numb = Integer.toString(primes.get(i));
			if(checkRotations(numb)) circularPrimes.add(Integer.parseInt(numb));
		}
		
		return circularPrimes;
	}
	
	public static boolean checkRotations(String numb){
		boolean circ = false;
		for(int i=0; i<numb.length(); i++){
			if(primes.contains(Integer.parseInt(numb))) circ = true;
			else return false;
			numb = numb.substring(1) + numb.substring(0,1);
		}
		
		return circ;
	}

}
