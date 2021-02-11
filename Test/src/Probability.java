import java.util.*;
import java.io.*;

public class Probability {

	public static void main(String[] args) {
		printPermutn("ABCD","");
	}

	public static void printPermutn(String str, String ans) 
    { 
  
        // If string is empty 
        if (str.length() == 0) { 
            System.out.println(ans); 
            return; 
        }
        
        for (int i = 0; i < str.length(); i++) { 
  
            // ith character of str
        		System.out.println("i is: " + i);
            char ch = str.charAt(i); 
            System.out.println("Ch is: " + ch);
            // Rest of the string after excluding  
            // the ith character 
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
            System.out.println("Remainder Of String is: " + ros);
            //System.out.println(str.substring(0,i));
            //ABCD
            //0123
            //A
            //
            // Recurvise call 
            printPermutn(ros, ans + ch); 
        } 
    }
}

