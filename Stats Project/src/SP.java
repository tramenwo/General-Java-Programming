import java.util.*;
import java.io.*;

public class SP {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String fName = scanner.nextLine();
		//Scanner SunsetScanner = new Scanner(new File("Sunset.txt"));
		BufferedReader br = new BufferedReader(new FileReader(fName+".txt"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(fName+"out.txt")));
		
		ArrayList<Float> nums = new ArrayList<Float>();
		
		String line = "";
		while ((line = br.readLine()) != null) {
			nums.add(Float.parseFloat(line));
		}
		
		int sSize = nums.size()/10;
		sSize -= sSize%10; //round down to nearest tenth
		
		ArrayList<Integer> inds = new ArrayList<>();
		while(inds.size() < sSize) {
			System.out.println(inds);
			int ind = (int)(Math.random()*nums.size());
			System.out.println(ind);
			if (!inds.contains(ind)) {
				inds.add(ind);
				pw.println(nums.get(ind));
			}
		}
		
		System.out.println(sSize);
		
		br.close();
		pw.close();
		scanner.close();
	}

}
