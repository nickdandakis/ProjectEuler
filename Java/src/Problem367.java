import java.util.Random;


public class Problem367 {
	static Random rnd = new Random();
	
	public static void main(String[] args) {
		int[] test = {4,1,50, 991, 2, 3, 150, 69};
		bozoSort(test);
	}

	public static void bozoSort(int[] test) {
		int count = 0;
		
		while(!isSorted(test)){
			test = shuffle2(test);
			print(test);
			count++;
		}
		
		System.out.println(count);
	}
	
	public static int[] shuffle2(int[] numbs){
		int i = rnd.nextInt(numbs.length);
		int j = rnd.nextInt(numbs.length);
		int temp = 0;
		
		temp = numbs[i];
		numbs[i] = numbs[j];
		numbs[j] = temp;
		
		return numbs;
	}
	
	public static void print(int[] numbers){
		for(int i=0; i<numbers.length; i++){
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] shuffle(int[] numbs, int swaps){
		int[] toSwap = new int[swaps];
		
		for(int c=0; c<swaps; c++){ //add indices to randomly swap
			toSwap[c] = rnd.nextInt(numbs.length);
		}
		
		for(int c=0; c<toSwap.length; c++){ //randomly swap swaps elements
			int i = rnd.nextInt(toSwap.length);
			int temp = 0;
			
			temp = numbs[toSwap[c]];
			numbs[toSwap[c]] = numbs[toSwap[i]];
			numbs[toSwap[i]] = temp;
		}
		
		return numbs;
	}
	
	public static boolean isSorted(int[] numbs){
		boolean flag = false;
		
		for(int i=0; i<numbs.length-1; i++){
			if(numbs[i] < numbs[i+1]) flag  = true;
			else{
				flag = false;
				break;
			}
		}
	
		return flag;
	}
}
