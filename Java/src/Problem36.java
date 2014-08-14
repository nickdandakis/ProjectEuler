
public class Problem36 {

	public static void main(String[] args) {
		int range = 1000000; String bini; int sum = 0;
		
		for(int i=1; i<range; i++){
			bini = Integer.toBinaryString(i);
			if(checkPali(bini) && checkPali(String.valueOf(i))) {
				System.out.println(i + " " + bini);
				sum += i;	
			}
		}
		
		System.out.println("Sum = " + sum);
	}
	
	public static boolean checkPali(String number){
		int left = 0;
        int right = number.length() - 1;
        
        while(left < right){
            if(number.charAt(left) != number.charAt(right)) return false;
            left++;
            right--;
        }
        
        return true;
	}
}
