package hackerrank.thirtydayschellange.day25;


import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	final int T = scan.nextInt();
    	
    	int[] input = new int[T];
    	
    	for ( int i = 0; i<T; i++) {
    		input[i] = scan.nextInt();
    	}
    	scan.close();

    	for(int i : input) {
    		if(checkForPrimes(i)) {
    			System.out.println("Prime");
    		}else {
    			System.out.println("Not prime");
    		}
    	}
    }

	private static boolean checkForPrimes(int i) {
		boolean isPrime = true;
		if(i<2) {
			return false;
		}else {
			for(int n = 2; n <= Math.sqrt(i); n++) {
				if(i%n == 0) {
					isPrime = false;
					break;
				}
			}
			return isPrime;
		}
	}
}