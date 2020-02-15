package hackerRank.thirtyDaysChellange.day_6;

import java.io.*;
import java.util.*;

public class Solution {

	private static final Scanner scan = new Scanner(System.in);
	
	private static String evenOddStrings(String s) {
		String even = new String();
		String odd	= new String();
		for (int i = 0; i<s.toCharArray().length;i++) {
			if ( i%2 == 0) {
				char[] tmp = s.toCharArray();
				even.concat(String.valueOf(tmp.toString().charAt(i)));
			}else {
				char[] tmp = s.toCharArray();
				odd.concat(String.valueOf(tmp.toString().charAt(i)));
			}
			return even.concat(String.copyValueOf("\r\n"+odd.chars()))
		}
		
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		BufferWriter bw  
		
		int n = scan.nextInt();
	     scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	     evenOddStrings
		String s = scan.nextLine();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        
        
       
        
        
        	
        
        
        scan.close();
    }
}

