package hackerrank.thirtydayschellange.day18;

import java.io.*;
import java.util.*;

public class Solution {
    
	private String queue ="";
	private String stack = "";
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

	private char dequeueCharacter() {			
		if(queue.length() > 0 ) {
			char result = queue.charAt(0);
			queue.substring(1);
			return result;
		}else {
			return '0';
		}
	}

	private char popCharacter() {
		if(stack.length() > 0 ) {
			char result = stack.charAt(stack.length()-1);
			stack.substring(0,stack.length()-1);
			return result;
		}else {
			return '0';
		}
	}

	private void enqueueCharacter(char c) {
		queue +=c;
	}

	private void pushCharacter(char c) {
		stack +=c;
	}
}