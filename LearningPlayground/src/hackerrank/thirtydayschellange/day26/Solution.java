package hackerrank.thirtydayschellange.day26;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	int returnedDay = scan.nextInt();
    	int returnedMonth = scan.nextInt();
    	int returnedYear = scan.nextInt();
    	
    	scan.nextLine();
    	
    	int expectedDay = scan.nextInt();
    	int expectedMonth = scan.nextInt();
    	int expectedYear = scan.nextInt();
    	
    	scan.close();
    	
    	if(returnedYear < expectedYear){
 			System.out.println(0);
 		}else if(returnedYear > expectedYear) {
    		System.out.println(10000);
    	}else {
    		if ( expectedMonth < returnedMonth) {
    			System.out.println(500*(returnedMonth-expectedMonth));
    		}else if ( expectedDay < returnedDay) {
    				System.out.println(15*(returnedDay-expectedDay));
    		}else {
    			System.out.println(0);
    		}
    	}    	
    }
}