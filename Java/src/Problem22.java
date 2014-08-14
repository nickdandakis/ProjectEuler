import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem22 {
	public static void main(String[] args) throws FileNotFoundException{
		ArrayList<String> uNames = fileToStrings("names.txt");
		String[] names = new String[uNames.size()];
		int[] scores = new int[names.length];
		uNames.toArray(names);
		Arrays.sort(names);

		int sum = 0;
		
		for(int i=0; i<names.length; i++){
			System.out.print(names[i] + " | ");
			for(int j=0; j<names[i].length(); j++){
				System.out.print((Character.getNumericValue(names[i].charAt(j)) - 9) + " + ");
				sum += (Character.getNumericValue(names[i].charAt(j)) - 9);
			}
			System.out.print(" x " + (i+1));
			scores[i] = sum * (i+1);
			System.out.println(" | Score: " + scores[i]);
			sum = 0;
		}
		int total = 0;
		for(int i=0; i<scores.length; i++){
			total += scores[i];
		}
		
		System.out.println("Total score: " + total);
		
	}
	
	public static ArrayList<String> fileToStrings(String filename) throws FileNotFoundException{
		File file = new File(filename);
		Scanner scan = new Scanner(file);
		ArrayList<String> strings = new ArrayList<String>();
		scan.useDelimiter("\",\"");
		
		while(scan.hasNext()){
			strings.add(scan.next());
		}
		
		strings.set(0, strings.get(0).substring(1));
		strings.set(strings.size()-1, strings.get(strings.size()-1).substring(0,strings.get(strings.size()-1).length()-1)); //trolololol mindfuck. removes " from first and last entry.
		scan.close();
		
		return strings; 
	}
	
}
