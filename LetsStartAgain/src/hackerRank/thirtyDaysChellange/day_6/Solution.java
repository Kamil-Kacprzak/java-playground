package hackerRank.thirtyDaysChellange.day_6;

import java.io.*;
import java.util.*;

public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	private static final int EVEN = 0;
	private static final int ODD  = 1;
	
	private static String[] evenOddStringSeparator(String s) {
		String[] results = new String[] {"",""};
		char 	 charAt;
		
		for (int i = 0; i<s.toCharArray().length;i++) {
			
			if ( i%2 == 0) {
				charAt = s.charAt(i);
				results[EVEN] = results[EVEN].concat(String.valueOf(charAt));
			}else {
				charAt = s.charAt(i);
				results[ODD] = results[ODD].concat(String.valueOf(charAt));
			}	
		}
		return results;
	}
	
	public static void main(String[] args) {
		
		int n = scan.nextInt();
	    scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	    String[] input = new String[n];
	    
	    for( int i = 0; i<n; i++) {
		   input[i] = scan.nextLine();
	    }
	    
	    String[] output;
	    
	    for (String s : input) {
	    	output = evenOddStringSeparator(s);
	    	System.out.println(output[EVEN]+" "+output[ODD]);
	    }

        scan.close();
    }
}

