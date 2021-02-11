import java.util.*;
import java.io.*;

public class ClashSplicer {

	public static void main (String[] args) throws IOException{
		//Scanner scanner = new Scanner(System.in);
		Scanner scanner = new Scanner(new File("Clash.txt"));
		String input;
		ArrayList<Integer> GoldAmounts = new ArrayList<Integer>();
		while((input = scanner.nextLine()) != null) {
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == ':') {
					String gold = input.substring(i+1);
					GoldAmounts.add(Integer.parseInt(gold));
				}
			}
		}
		for (int i = 0; i < args.length; i++) {
			
		}
		scanner.close();
	}
}
