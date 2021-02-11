//import java.io.*;
import java.util.*;

public class Letter_Word {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter in the word you want to be reverted:\n>>");
		char[] name = scanner.nextLine().toUpperCase().toCharArray();
		int[] numbers = new int[name.length];
		for (int i = 0; i < name.length; i++) {
			numbers[i] = (int)name[i]-64;
			System.out.print(numbers[i] + " ");
		}
		scanner.close();
	}

}
