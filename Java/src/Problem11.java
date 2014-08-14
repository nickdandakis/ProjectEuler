import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem11 {
	

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Greatest product of adjacent numbers in any direction in file.");
		System.out.print("Filename: ");
		int[][] grid = fileTo2DArray(input.nextLine());
		
		print2DArray(grid);
		
		System.out.println(maxAdjacentProduct(grid, 4));
	}
	
	public static int[][] fileTo2DArray(String filename) throws FileNotFoundException{
		File file = new File(filename);
		Scanner filescn = new Scanner(file);
		int rows = 0;
		int cols = 1;
		String line = null;
		
		while(filescn.hasNext()){
			line = filescn.nextLine();
			rows++;
		}
		
		for(int i=0; i<line.length(); i++){
			if(Character.isWhitespace(line.charAt(i))) cols++;
		}
		
		int [][] grid = new int[rows][cols];
		
		filescn = new Scanner(file);
		while(filescn.hasNext()){
			for(int y=0; y<rows; y++){
				for(int x=0; x<cols; x++){
					grid[y][x] = filescn.nextInt();
				}
			}
		}
		
		return grid;
	}

	public static int maxAdjacentProduct(int[][] numbs, int radius){
		int product = 1; int maxproduct = 0;
		
		for(int y=0; y<numbs.length; y++){
			for(int x=0; x<numbs[y].length; x++){
				if(((y+1) - radius) >= 0){
					//Check up
					int tempy = y;
					for(int i=0; i<radius; i++){
						product *= numbs[tempy][x];
						tempy--;
					}
	
					if(product > maxproduct) {
						maxproduct = product;
						//System.out.println(maxproduct);
					}
					product = 1;
					
				}
				if((y+radius) <= numbs.length){
					//Check down
					int tempy = y;
					for(int i=0; i<radius; i++){
						product *= numbs[tempy][x];
						tempy++;
					}
					
					if(product > maxproduct) {
						maxproduct = product;
						//System.out.println(maxproduct);
					}
					product = 1;
				}
				if(((x+1) - radius) >= 0){
					//Check left
					int tempx = x;
					for(int i=0; i<radius; i++){
						product *= numbs[y][tempx];
						tempx--;
					}
					
					if(product > maxproduct) {
						maxproduct = product;
						//System.out.println(maxproduct);
					}
					product = 1;
				}
				if((x+radius) <= numbs[y].length){
					//Check right
					int tempx = x;
					for(int i=0; i<radius; i++){
						product *= numbs[y][tempx];
						tempx++;
					}
					
					if(product > maxproduct) {
						maxproduct = product;
						//System.out.println(maxproduct);
					}
					product = 1;
				}
				if((((y+1) - radius) >= 0) && ((x+radius) <= numbs[y].length)){
					//Check top right
					int tempx = x;
					int tempy = y;
					for(int i=0; i<radius; i++){
						product *= numbs[tempy][tempx];
						tempy--;
						tempx++;
					}
					
					if(product > maxproduct) {
						maxproduct = product;
						//System.out.println(maxproduct);
					}
					product = 1;
				}
				if((((y+1) - radius) >= 0) && (((x+1) - radius) >= 0)){
					//Check top left
					int tempx = x;
					int tempy = y;
					for(int i=0; i<radius; i++){
						product *= numbs[tempy][tempx];
						tempy--;
						tempx--;
					}
					
					if(product > maxproduct) {
						maxproduct = product;
						//System.out.println(maxproduct);
					}
					product = 1;
				}
				if(((y+radius) <= numbs.length) && ((x+radius) <= numbs[y].length)){
					//Check down right
					int tempx = x;
					int tempy = y;
					for(int i=0; i<radius; i++){
						product *= numbs[tempy][tempx];
						tempy++;
						tempx++;
					}
					
					if(product > maxproduct) {
						maxproduct = product;
						//System.out.println(maxproduct);
					}
					product = 1;
				}
				if(((y+radius) <= numbs.length) && (((x+1) - radius) >= 0)){
					//Check down left
					int tempx = x;
					int tempy = y;
					for(int i=0; i<radius; i++){
						product *= numbs[tempy][tempx];
						tempy++;
						tempx--;
					}
					
					if(product > maxproduct) {
						maxproduct = product;
						//System.out.println(maxproduct);
					}
					product = 1;
				}
			}
		}
		
		return maxproduct;
	}
	
	public static void print2DArray(int[][] ar2D){
		for(int y=0; y<ar2D.length; y++){
			for(int x=0; x<ar2D[y].length; x++){
				if(x == (ar2D[y].length - 1)) System.out.println("(" + y + "," + x + ")" + ar2D[y][x] + " ");
				else System.out.print("(" + y + "," + x + ")" + ar2D[y][x] + " ");
			}
		}
	}
}
