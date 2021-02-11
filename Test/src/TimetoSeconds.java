import java.util.*;

public class TimetoSeconds {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your race time:");
		String Time = scanner.nextLine();
		float TimeinSeconds = 0;
		int minutesorhours = 0;
		for (int i = 0; i < Time.length(); i++) {
			if (Time.charAt(i) == ':') {
				minutesorhours += 1;
			}
		}
		if (minutesorhours == 2) {
			//1:59:99
			//0123456
			int hours = Integer.parseInt(Time.charAt(0) + ""),minutes = Integer.parseInt(Time.charAt(2) + "")*10 + Integer.parseInt(Time.charAt(3) + ""),seconds = Integer.parseInt(Time.charAt(5) + "") * 10 + Integer.parseInt(Time.charAt(6) + "");
			TimeinSeconds = (float) (hours * 60 + minutes + .01*seconds);
			System.out.printf("%.2f",TimeinSeconds);
		}
		else {
			//1:40.91
			//58:18
			//26:17.45
			boolean milliseconds = false;
			for (int i = 0; i < Time.length(); i++) {
				if (Time.charAt(i) == '.') {
					milliseconds = true;
					break;
				}
			}
			if (milliseconds) {
				
			}
			else {
				
			}
		}
		scanner.close();
	}

}
