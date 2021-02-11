import java.util.*;

public class TestInfo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int correct = 0, unanswered = 0, incorrect = 0;
		String line;
		line = scanner.nextLine();
		//System.out.println(line);
		String[] ternary = line.split("\t");
		for (int i = 0; i < ternary.length; i++) {
			if (ternary[i].equals("Correct")) {
				correct += 1;
			}
			if (ternary[i].equals("Unanswered")) {
				unanswered += 1;
			}
			if (ternary[i].equals("Incorrect")) {
				incorrect += 1;
			}
		}
		float points, percentage;
		points = (float)((float)correct * 6 + (float)unanswered * 1.5);
		percentage = points/150*100;
		System.out.printf("Correct: %d\nIncorrect: %d\nUnanswered: %d\nAnswered: %d\nPoints: %.1f\nPercentage: %.2f", correct,incorrect,unanswered,correct + incorrect,points,percentage);
		scanner.close();
	}

}
