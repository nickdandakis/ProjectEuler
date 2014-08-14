
public class Problem28 {

	public static void main(String[] args) {
		int layer = 0;
		int count = 0;
		int sum = 1;
		
		for(int i=2; i<=1002001; i++){
			if(i % 2 != 0){
				
			}
		}

	}
	
	public static int[][] buildSpiral(int size){
		int numb = size;
		int[][] spiral = new int[size][size];
		boolean done = false;
		int y = 0; int x = size - 1; int pass = 0;
		
		while(!done){
			spiral[y][x] = numb;
			if(x == pass && y == pass){
				for(y = pass; y<size; y++){
					spiral[y][x] = numb;
				}
				pass++;
			}
			else if(x == )
			
			numb--;
			if(y == (size / 2) + 1 && x == (size / 2) + 1) done = true;
		}
	}
}
