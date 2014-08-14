import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;


public class Problem29 {

	public static void main(String[] args) {
		ArrayList<BigInteger> uterms = new ArrayList<BigInteger>();
		
		BigInteger a = BigInteger.ZERO;
		
		for(int i=2; i<=100; i++){
			a = BigInteger.valueOf(i);
			for(int j=2; j<=100; j++){
				uterms.add(bigPow(a, j));
			}
		}
		
		BigInteger[] terms = new BigInteger[uterms.size()];
		uterms.toArray(terms);
		Arrays.sort(terms);
		uterms = new ArrayList<BigInteger>(Arrays.asList(terms));
		System.out.println(uterms.size());
		
		//first pass
		for(int i=0; i<uterms.size()-1; i++){
			if(uterms.get(i).equals(uterms.get(i+1))){
				uterms.remove(i);
			}
		}
		//second pass
		for(int i=0; i<uterms.size()-1; i++){
			if(uterms.get(i).equals(uterms.get(i+1))){
				uterms.remove(i);
			}
		}
		//etc
		for(int i=0; i<uterms.size()-1; i++){
			if(uterms.get(i).equals(uterms.get(i+1))){
				uterms.remove(i);
			}
		}
		
		for(int i=0; i<uterms.size()-1; i++){
			if(uterms.get(i).equals(uterms.get(i+1))){
				uterms.remove(i);
			}
		}
		
		System.out.println(uterms.size());

	}
	
	public static BigInteger bigPow(BigInteger base, int exp){
		BigInteger result = BigInteger.ONE;
		
		for(int i=0; i<exp; i++){
			result = result.multiply(base);
		}
		
		return result;
	}

}
