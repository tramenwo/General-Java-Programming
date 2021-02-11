import java.util.*;

public class GameSplicer {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] Placement = new int[50];
		double[] PointsAgainst = new double[50];
		for (int i = 0; i < 50; i++) {
			Placement[i] = scanner.nextInt();
			PointsAgainst[i] = scanner.nextDouble();
		}
		
		scanner.close();
	}
	
}
