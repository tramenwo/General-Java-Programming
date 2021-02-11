import java.util.*;
import java.io.*;

public class SunsetAllTime extends SunsetAthlete{

	public SunsetAllTime(String name) {
		super(name);
	}
	
	public static void main(String[] args) throws Exception{
		SunsetAthlete.main(new String[] {""});
		float[] AllTimes = new float[SunsetAllTime.size()];
		for (int i = 0; i < SunsetAllTime.size(); i++) {
			AllTimes[i] = SunsetAllTime.get(i).getTimeinSeconds();
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
