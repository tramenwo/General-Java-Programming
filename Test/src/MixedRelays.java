import java.util.*;

public class MixedRelays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the Distance Travelled:\n1.3k\n2.5k");
		int oot = scanner.nextInt();
		scanner.nextLine();
		if (oot == 1) {
			System.out.println("What is the Time?");
			String time = scanner.nextLine();
			int seconds;
			if (time.length() == 4) {
				
			}
			else if (time.length() == 5) {
				
			}
		}
		else if (oot == 2) {
			System.out.println("What is the Time?");
			String time = scanner.nextLine();
			int seconds = (Integer.parseInt(Character.toString(time.charAt(0)))*10 + Integer.parseInt(Character.toString(time.charAt(1))))* 60 + Integer.parseInt(Character.toString(time.charAt(3)))*10 + Integer.parseInt(Character.toString(time.charAt(4)));
			System.out.println(getTime(seconds/5));
			System.out.println(getTime((int)((double)seconds/3.107)));
		}
		scanner.close();
	}

	public static String getTime(int seconds) {
		System.out.println(seconds);
		String time = "";
		time = Integer.toString(seconds/60) + ":";
		if (Integer.toString(seconds%60).length() == 1) {
			time += "0";
			time += Integer.toString(seconds%60);
		}
		else {
			time += Integer.toString(seconds%60);
		}
		return time;
	}
}
