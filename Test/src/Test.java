import java.io.*;
import java.util.*;

public class Test {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		boolean Loop = true;

	
		/*String in = scanner.nextLine();
		int top = Integer.parseInt(in.charAt(0) + "" + in.charAt(1));
		int bottom = Integer.parseInt(in.charAt(3) + "" + in.charAt(4));
		System.out.println(top);
		System.out.println(bottom);
		System.out.println((double)(top)/(double)(bottom));*/
		double QuizPoints = scanner.nextDouble();
		scanner.nextLine();
		String Labs = scanner.nextLine();
		double LabsGrade = (double)Integer.parseInt(Labs.charAt(0) + "" + Labs.charAt(1) + "" + Labs.charAt(2))/(double)Integer.parseInt(Labs.charAt(4) + "" + Labs.charAt(5) + "" + Labs.charAt(6));
		while(Loop) {
			String in = scanner.nextLine();
			if (in.equals("QUIT")) {
				Loop = false;
				break;
			}
			//double Percentage = 100.0*(double)(QuizPoints - Integer.parseInt(in.charAt(0) + "" + in.charAt(1)))/(double)(528 - Integer.parseInt(in.charAt(3) + "" + in.charAt(4)));
			double Percentage = 100.0*(double)(QuizPoints)/(double)528;
			double Grade = .1*60 + Percentage*.7 + LabsGrade*.2;
			System.out.printf("%.2f\n",Percentage);
			System.out.printf("%.2f", Grade);
		}
		scanner.close();
	}

	//Left Bottom Right Upper
	public static int computeArea(int[] cowfeed, int[]lawnmower) {
        int A = cowfeed[0];
        int B = cowfeed[1];
        int C = cowfeed[2];
        int D = cowfeed[3];
        int E = lawnmower[0];
        int F = lawnmower[1];
        int G = lawnmower[2];
        int H = lawnmower[3];
        int right = Math.max(A,E);
        int left = Math.min(C, G);
        int top = Math.max(B, F);
        int bottom = Math.min(D,H);
        //If overlap
        int overlap = 0;
        if(right < left && top < bottom) {
             overlap = (right - left) * (bottom - top);
        }
        return overlap;
    }
	
	public static int computeOverlap(int A, int B, int C, int D) {
		int overlap =0;
		int max = Math.max(B, D);
		int min = Math.min(A, C);
		return overlap;
	}
}
