import java.util.*;
import java.io.*;

public class JesuitAllTime extends JesuitAthlete{

	public JesuitAllTime(String name) {
		super(name);
	}
	
	public static void main(String[] args) throws Exception{
		JesuitAthlete.main(new String[] {""});
		float[] AllTimes = new float[JesuitAllTime.size()];
		for (int i = 0; i < JesuitAllTime.size(); i++) {
			AllTimes[i] = JesuitAllTime.get(i).getTimeinSeconds();
			System.out.println(AllTimes[i]);
		}
		PrintWriter out = new PrintWriter (new BufferedWriter (new FileWriter ("AllTimesNoAthlete.txt")));
		for (int i = 0; i < AllTimes.length; i++) {
			out.println(AllTimes[i]);
		}
		out.close();
		PrintWriter out2 = new PrintWriter (new BufferedWriter (new FileWriter ("AllTimesSortedNoAthlete.txt")));
		Arrays.sort(AllTimes);
		for (int i = 0; i < AllTimes.length; i++) {
			out2.println("Rank " + i + ": " + AllTimes[i]);
		}
		out2.close();
		/**System.out.println("This is supposed to be Year Rank: " + fileScanner.next());
		System.out.println("This is supposed to be Grade: " + fileScanner.nextInt());
		System.out.println("This is supposed to be First Name: " + fileScanner.next());
		System.out.println("This is supposed to be Last Name: " + fileScanner.next());
		System.out.println("This is supposed to be Time: " + fileScanner.next());
		System.out.println("This is supposed to be PR: " + fileScanner.next());
		System.out.println("This is supposed to be Date: " + fileScanner.next() + " " + fileScanner.next());
		System.out.println("This is supposed to be Meet Name: " + fileScanner.nextLine());*/
	}
	
}
