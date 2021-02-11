
import java.util.*;

public class Relay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*boolean running = true;
		while (running) {
			ArrayList<Integer> splits = new ArrayList<Integer>();
			System.out.println("What is the name of the Relay Team:");
			String teamName = scanner.nextLine();
			for (int i = 1;i<=5;i++) {
				//System.out.println("Name " + i + "th relay split");
				String splitString = scanner.nextLine();
				char[] split = splitString.toCharArray();
				if (split.length == 4) {
					splits.add(Integer.parseInt(Character.toString(split[0])) * 60 + Integer.parseInt(Character.toString(split[2]))*10 + Integer.parseInt(Character.toString(split[3])));
				}
				if (split.length == 5) {
					splits.add( (Integer.parseInt(Character.toString(split[0])) * 10 + Integer.parseInt(Character.toString(split[1])))*60 + Integer.parseInt(Character.toString(split[3]))*10 + Integer.parseInt(Character.toString(split[4])));
				}
				//System.out.println("Split is: " + splitString + "\nTime in seconds is: " + splits.get(splits.size()-1));
			}
			int timeSum = 0;
			for (int i = 0; i < splits.size(); i++) {
				timeSum += splits.get(i);
			}
			System.out.println("Projected Time for Team: " + teamName + "is: " + getTime(timeSum));
			//System.out.println("Do you want to continue?");
			String in = scanner.nextLine();
			if (in.equals("NO")) {
				running = false;
			}
		}*/
		for (int i = 2;i <= 577; i++) {
			System.out.println(getTime((int)scanner.nextDouble()));
		}
		scanner.close();
	}
	
	public static String getTime(int seconds) {
		//System.out.println(seconds);
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
