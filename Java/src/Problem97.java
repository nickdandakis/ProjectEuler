import java.math.BigInteger;


public class Problem97 {


	public static void main(String[] args) {
		BigInteger exp = new BigInteger("7830457");
		BigInteger mod = new BigInteger("10000000000");
		BigInteger two = new BigInteger("2");
		BigInteger mersPrime = BigInteger.ONE;
		
		mersPrime = two.modPow(exp, mod).multiply(BigInteger.valueOf(28433)).add(BigInteger.ONE);
		
		System.out.println(mersPrime.mod(mod));

	}

}
