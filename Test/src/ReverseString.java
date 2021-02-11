import java.util.*;
import java.io.*;

public class ReverseString {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		/**String input = scanner.nextLine();
		String[] broken = input.split(" ");
		for (int i = broken.length - 1; i >= 0; i--) {
			System.out.print(broken[i] + " ");
		}*/
		char[] input = scanner.nextLine().toCharArray();
		ArrayList<Integer> counters = new ArrayList<Integer>();
		counters.add(input.length);
		for (int i = input.length-1; i >= 0; i--) {
			if (input[i] == ' ') {
				counters.add(i);
			}
		}
		counters.add(-1);
		//ROY IS DUM
		//0123456789
		//Counters: 10,6,3
		for (int i = 0; i < counters.size()-1; i++) {
			print(counters.get(i+1)+1,counters.get(i),input);
		}
		scanner.close();
	}
	
	public static void print (int begin, int end, char[] input) {
		for (int i = begin; i < end; i++) {
			System.out.print(input[i]);
		}
		System.out.print(" ");
	}
}
