
public class Sums {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += 2*(Math.pow(i, 3) - Math.pow(i, 2));
		}
		System.out.println(sum);
	}

}
