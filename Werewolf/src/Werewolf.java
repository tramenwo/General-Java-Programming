import java.util.*;


public class Werewolf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Werewolf, Minion, TroubleMaker, Seer, Robber, Mason(s), Villager(s), Insomniac
		System.out.println("How many players are there?");
		int n = scanner.nextInt();
		scanner.nextLine();
		String[][] Roles = new String[2][n+3];
		// _,_
		// _,_
		for (int i = 0; i < 3; i++) {
			Roles[0][i+n] = "Middle Card " + Integer.toString(i+1);
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Enter name of Player:");
			Roles[0][i] = scanner.nextLine();
		}
		System.out.println(Arrays.toString(Roles[0]));
		System.out.println("Enter string of roles");
		for (int i = 0; i < n + 3; i++) {
			System.out.print(i);
		}
		System.out.println();
		String roles = scanner.nextLine();
		String rngRoles = generateRandom(roles);
		while (CheckifValidGame(rngRoles) == false) {
			rngRoles = generateRandom(roles);
		}
		//System.out.println(rngRoles);
		for (int i = 0; i < Roles[1].length; i++) {
			if (rngRoles.charAt(i) == 'W') {
				Roles[1][i] = "Werewolf";
			}
			else if (rngRoles.charAt(i) == 'M') {
				Roles[1][i] = "Minion";
			}
			else if (rngRoles.charAt(i) == 'A') {
				Roles[1][i] = "Mason";
			}
			else if (rngRoles.charAt(i) == 'T') {
				Roles[1][i] = "Troublemaker";
			}
			else if (rngRoles.charAt(i) == 'S') {
				Roles[1][i] = "Seer";
			}
			else if (rngRoles.charAt(i) == 'R') {
				Roles[1][i] = "Robber";
			}
			else if (rngRoles.charAt(i) == 'V') {
				Roles[1][i] = "Villager";
			}
			else if (rngRoles.charAt(i) == 'I') {
				Roles[1][i] = "Insomniac";
			}
		}
		int clear, Robber = 0, Robbed = 0, T1 = 0, T2 = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Hello Chaggol: " + Roles[0][i]);
			System.out.println("When you want to see your card, type 0");
			clear = Integer.parseInt(scanner.nextLine());
			if (clear != 0) {
				System.out.println("OOPS. POOPS.");
			}
			System.out.println("\nYour Role is: " + Roles[1][i]);
			if (Roles[1][i] == "Werewolf") {
				for (int j = 0; j < n+3; j++) {
					if (Roles[1][j] == "Werewolf" && i != j) {
						if (j > n-1) {
							System.out.println("The other werewolf is in the center. Now which middle card do you want to see:(Must be 1 2 or 3)");
							int WerewolfSee = Integer.parseInt(scanner.nextLine());
							System.out.println(Roles[1][WerewolfSee + n - 1]);
						}
						else {
							System.out.println("The other werewolf is: " + Roles[0][j]);
						}
					}
				}
				System.out.println("When you want to clear type 0");
				clear = Integer.parseInt(scanner.nextLine());
				if (clear == 0) {
					for (int j = 0; j < 9; j++) {
						System.out.println();
					}
				}
			}
			else if (Roles[1][i] == "Minion") {
				int W1 = 0, W2 = 0;
				for (int j = 0; j < n+3; j++) {
					if (Roles[1][j] == "Werewolf") {
						if (W1 == 0) {
							W1 = j+1;
						}
						else if (W2 == 0) {
							W2 = j+1;
						}
					}
				}
				System.out.println("Werewolf 1 is: " + Roles[0][W1-1]);
				if (W2-1 > n-1) {
					System.out.println("Werewolf 2 is in the Center");
				}
				else {
					System.out.println("Werewolf 2 is: " + Roles[0][W2-1]);
				}
				System.out.println("When you want to clear type 0");
				clear = Integer.parseInt(scanner.nextLine());
				if (clear == 0) {
					for (int j = 0; j < 9; j++) {
						System.out.println();
					}
				}
			}
			else if (Roles[1][i] == "Mason") {
				for (int j = 0; j < n+3; j++) {
					if (Roles[1][j] == "Mason" && i != j) {
						if (j > n-1) {
							System.out.println("The other Mason is: In the Center");
						}
						else {
							System.out.println("The other Mason is: " + Roles[0][j]);
						}
					}
				}
				System.out.println("When you want to clear type 0");
				clear = Integer.parseInt(scanner.nextLine());
				if (clear == 0) {
					for (int j = 0; j < 9; j++) {
						System.out.println();
					}
				}
			}
			else if (Roles[1][i] == "Troublemaker") {
				System.out.println("Enter in integer of person 1 that you want to troublemake");
				for (int j = 0; j < n; j++) {
					System.out.println(j + 1 + ". " + Roles[0][j]);
				}
				T1 = Integer.parseInt(scanner.nextLine());
				System.out.println("Enter in integer of person 2 that you want to troublemake");
				for (int j = 0; j < n; j++) {
					System.out.println(j + 1 + ". " + Roles[0][j]);
				}
				T2 = Integer.parseInt(scanner.nextLine());
				System.out.println("When you want to clear type 0");
				clear = Integer.parseInt(scanner.nextLine());
				if (clear == 0) {
					for (int j = 0; j < 20; j++) {
						System.out.println();
					}
				}
			}
			else if (Roles[1][i] == "Seer") {
				System.out.println("Do you want to look 1: Look at 2 cards in the center or "
						+ "2: at a person's card?(Answer with 1 or 2)");
				int Answer = Integer.parseInt(scanner.nextLine());
				if (Answer == 1) {
					System.out.println("Which two middle cards do you want to look at?\nEnter in number of 1st card: (Answer must be: 1, 2 or 3)");
					int C1 = Integer.parseInt(scanner.nextLine());
					System.out.println("Enter in number of 2nd card (Answer must be: 1, 2 or 3)");
					int C2 = Integer.parseInt(scanner.nextLine());
					System.out.println("Middle Card " + C1 + " is: " + Roles[1][C1 + n - 1]);
					System.out.println("Middle Card " + C2 + " is: " + Roles[1][C2 + n - 1]);
				}
				else if (Answer == 2) {
					System.out.println("Enter in integer of the person you want to see");
					for (int j = 0; j < n; j++) {
						System.out.println(j + 1 + ". " + Roles[0][j]);
					}
					int C3 = Integer.parseInt(scanner.nextLine());
					System.out.println(Roles[0][C3-1] + "'s Role is: " + Roles[1][C3-1] + ".");
				}
				System.out.println("When you want to clear type 0");
				clear = Integer.parseInt(scanner.nextLine());
				if (clear == 0) {
					for (int j = 0; j < 9; j++) {
						System.out.println();
					}
				}
			}
			else if (Roles[1][i] == "Robber") {
				Robber = i;
				System.out.println("Enter in integer of person you want to rob:");
				for (int j = 0; j < n; j++) {
					System.out.println(j + 1 + ". " + Roles[0][j]);
				}
				Robbed = scanner.nextInt();
				scanner.nextLine();
				System.out.println(Roles[0][Robbed-1] + "'s Role is: " + Roles[1][Robbed-1] + ".");
				System.out.println("When you want to clear type 0");
				clear = Integer.parseInt(scanner.nextLine());
				if (clear == 0) {
					for (int j = 0; j < 9; j++) {
						System.out.println();
					}
				}
			}
			else if (Roles[1][i] == "Villager") {
				System.out.println("Do you want to village?\nLOL you can't you meme");
				System.out.println("When you want to clear type 0");
				clear = Integer.parseInt(scanner.nextLine());
				if (clear == 0) {
					for (int j = 0; j < 9; j++) {
						System.out.println();
					}
				}
			}
		}
		if (Robbed != 0){
			//System.out.println("Robber is: " + Roles[0][Robber] + "\nRobbed is: " + Roles[0][Robbed-1]);
			Roles[1][Robber] = Roles[1][Robbed-1];
			Roles[1][Robbed-1] = "Robber";
		}
		if (T1 != 0){
			//System.out.println("Troublemaked 1 is: " + Roles[0][T1-1] + "\nTroublemaked 2 is: " + Roles[0][T2-1]);
			String temp = Roles[1][T1-1];
			Roles[1][T1-1] = Roles[1][T2-1];
			Roles[1][T2-1] = temp;
		}
		System.out.println("When you want to see the cards, type 0.");
		clear = Integer.parseInt(scanner.nextLine());
		if (clear == 0) {
			for (int i = 0; i < n + 3; i++) {
				System.out.println(i + 1 + ". " + Roles[0][i] + " " + Roles[1][i]);
			}
		}
		scanner.close();
	}
	
	public static boolean CheckifValidGame (String rngRoles) {
		if (rngRoles.charAt(rngRoles.length()-1) == 'W' && rngRoles.charAt(rngRoles.length()-2) == 'W' || 
				rngRoles.charAt(rngRoles.length()-1) == 'W' && rngRoles.charAt(rngRoles.length()-3) == 'W' ||
				rngRoles.charAt(rngRoles.length()-2) == 'W' && rngRoles.charAt(rngRoles.length()-3) == 'W') {
			return false;
		}
		return true;
	}
	
	public static char getChar (ArrayList<Character> v) {
		int n = v.size();
		
		int index = (int)(Math.random() * n);
		
		char num = v.get(index);
		v.set(index, v.get(n-1));
		v.remove(n-1);
		return num;
	}
	
	public static String generateRandom (String roles) {
		ArrayList<Character> v = new ArrayList<>(roles.length());
		
		for (int i = 0; i < roles.length(); i++) {
			v.add(roles.charAt(i));
		}
		String output = "";
		while (v.size() > 0) {
			output += Character.toString(getChar(v));
		}
		return output;
	}
}
