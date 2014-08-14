import java.math.BigInteger;
import java.util.ArrayList;
//import java.util.Collections;


public class Problem187 {
	static int limit = 100000000;

	public static void main(String[] args) {
		buildComposites(sieveErato(limit));
	}
	
	private static ArrayList<Long> sieveErato(int n){
		boolean[] N = new boolean[(n + 1)];
		for (int i = 2; i < n; i++) {
			N[i] = true;
		}
		ArrayList<Long> prime = new ArrayList<Long>();
		
		for(int i=2; i * i <= n; i++){
			if(N[i]){
				for(int j = i; i * j <= n; j++){
					N[i * j] = false;
				}
			}
		}
		
        for (int i = 2; i <= n; i++) {
            if (N[i]) prime.add((long) i);
        }
        		        
		return prime;
				
	}
	
	private static void buildComposites(ArrayList<Long> primes){
		int nOfComposites = 0; //number of composites that we're looking for
		BigInteger composite = BigInteger.ZERO;
		BigInteger iFactor = BigInteger.ZERO;
		BigInteger jFactor = BigInteger.ZERO;
		
		//start at i=0 and multiply against self and then next until last prime factor (hence j=i to size())
		for(int i=0; i<primes.size(); i++){
			search:
			for(int j=i; j<primes.size(); j++){
				iFactor = BigInteger.valueOf(primes.get(i));
				jFactor = BigInteger.valueOf(primes.get(j));
				composite = iFactor.multiply(jFactor);
				if(composite.compareTo(BigInteger.valueOf(limit))<0) {
					nOfComposites++; //found composite that we're looking for so increment
				}
				else break search;
			}
		}
		
		System.out.print(nOfComposites); //print that son of a bitch!
	}
}
