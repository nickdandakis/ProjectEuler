import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Problem8 {
	static int digitsperline = 0;
	
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Filename of file containing digits to find greatest product of consecutive digits:");
		//Input digits from .txt to ArrayList of Strings. Every entry is one line of 50 digits
		ArrayList<String> text = fileToStrings(input.nextLine());
		digitsperline = text.get(0).length(); 
		System.out.println("Number of consecutive digits to find max product:");
		int consdigits = input.nextInt();
		
		maxProductOfConsDigits(text, digitsperline, consdigits);
		
	}

	private static void maxProductOfConsDigits(ArrayList<String> text, int perline, int cons) {
		StringBuffer sb = new StringBuffer();
		//Make huge string containing all digits
		for(int i=0; i<20; i++){
			sb.append(text.get(i));
		}
		
		int maxproduct = 0;
		for(int i=0; i<(perline-cons+1); i++){
			int product = 1;
			for(int j=0; j<cons; j++){
				String strdigits = sb.substring(i, i+cons);
				char chrdigit = strdigits.charAt(j); //select each number of consecutive digit string
				int intdigit = Character.getNumericValue(chrdigit); //convert to numerical representation
				product = product * intdigit;
				if(product > maxproduct) maxproduct = product;
			}
		}
		
		System.out.println(maxproduct);
	}

	private static ArrayList<String> fileToStrings(String filename) throws FileNotFoundException,
			IOException {
		FileInputStream fstream = new FileInputStream(filename);
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		ArrayList<String> text = new ArrayList<String>();
		String line = null;
		boolean complete = false;
		do {
			line = br.readLine();
			if(line == null) complete = true;
			else {
				text.add(line);
			}
		} while (!complete);
		
		br.close();
		return text;
	}

}
