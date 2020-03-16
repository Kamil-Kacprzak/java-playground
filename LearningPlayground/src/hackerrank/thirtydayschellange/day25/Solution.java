package hackerrank.thirtydayschellange.day25;
/*
 * Solution for the task based on Sieve of Eratosthenes
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	final int T = scan.nextInt();
    	
    	int[] input = new int[T];
    	
    	for ( int i = 0; i<T; i++) {
    		input[i] = scan.nextInt();
    	}
    	scan.close();
    	
    	boolean[] prime = checkForPrimes(input);

    	for(int i : input) {
    		if(prime[i]) {
    			System.out.println("Prime");
    		}else {
    			System.out.println("Not prime");
    		}
    	}
    }

	private static boolean[] checkForPrimes(int[] input) {
		int[] tmp;
		tmp = input.clone();
		Arrays.sort(tmp);
		final int last = tmp.length-1;
		
		boolean prime[] = new boolean[tmp[last]+1];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		
		for(int i = 2; i<= Math.sqrt(tmp[last]); i++) {
			for(int t = i+i; t<tmp[last]+1; t = t+i) {
				prime[t] = false;
			}
		}
		
		return prime;
	}
}