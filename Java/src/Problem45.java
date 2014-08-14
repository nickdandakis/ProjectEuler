import java.math.BigInteger;


public class Problem45 {


	public static void main(String[] args) {
		System.out.println("Numbers that are both triangle and pentagonal and hexagonal: ");
		
		int i;		int j;		int k;
		int range = 1000000;
		BigInteger T = BigInteger.ZERO; BigInteger P = BigInteger.ZERO; BigInteger H = BigInteger.ZERO;
		
		for(i = 1; i<range; i++){
			T = triang(i);
			for(j = 1; j<range; j++){
				P = pentag(j);
				if(T.equals(P)){
					for(k = 1; k<range; k++){
						H = hexag(k);
						if(P.equals(H)){
							System.out.println("T[" + i + "]: " + T + " P[" + j + "]: " + P + " H[" + k + "]: " + H);
						}
						if(P.compareTo(H) == -1) break;
					}
					P = pentag(j++);
				}
				if(T.compareTo(P) == -1) break;
			}
		}
		
		System.out.println("DONE");
	}
	
	public static BigInteger triang(int i){
		BigInteger bigI = BigInteger.valueOf(i);
//		(i * (i + 1)) / 2;
		return bigI.multiply(bigI.add(BigInteger.ONE)).divide(BigInteger.ONE.add(BigInteger.ONE));
		
	}
	
	public static BigInteger pentag(int i){
		BigInteger bigI = BigInteger.valueOf(i);
//		((j * ((3* j ) - 1)) / 2);
		return bigI.multiply(BigInteger.ONE.add(BigInteger.ONE.add(BigInteger.ONE))).subtract(BigInteger.ONE).multiply(bigI).divide(BigInteger.ONE.add(BigInteger.ONE));
	}
	
	public static BigInteger hexag(int i){
		BigInteger bigI = BigInteger.valueOf(i);
//		k * ((2 * k) - 1);
		return bigI.multiply(BigInteger.ONE.add(BigInteger.ONE)).subtract(BigInteger.ONE).multiply(bigI);
	}
	
	public static int[] buildPentagNumbs(int n){
		int[] numbs = new int[n+1];
		numbs[0] = 0;
		
		for(int i=1; i<=n; i++){
			numbs[i] = ((i * ((3 * i) - 1)) / 2);
		}
		
		return numbs;
	}
	
	public static int[] buildHexNumbs(int n){
		int[] numbs = new int[n+1];
		numbs[0] = 0;
		
		for(int i=0; i<=n; i++){
			numbs[i] = (i * ((2 * i) - 1));
		}
		
		return numbs;
	}

}
