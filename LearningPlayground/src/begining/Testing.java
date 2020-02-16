package begining;

import java.util.Arrays;
import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		
		playingWithFormat();
	}

	private static void playingWithFormat() {

		int n = 0;
		// Naming suffixes
		float f = 20.5F;
		long l = 20000000000L;
		//Output:20000000000

		
		// Post/pre incrementation 
		System.out.println("Post incrementing: "+n++);
		System.out.println("Pre incrementing: "+(++n));
		
		// Narrowing conversion in unsafe manner 
		n = (int) l;
		System.out.println("New n: "+n);
		System.out.println("L: "+l);
		n = 0;
		
		// Declare and initialize array separately in short syntax - not allowed
		int[] intArray;
		intArray = new int[] {3,2,1,0};
		
		Arrays.sort(intArray);
		System.out.println("Sorted array: "+Arrays.toString(intArray)); // reference to object: ntArray.toString()
		System.out.print(intArray[2]);
		
		//Escape sequence + string control with format specifiers
		System.out.println("\t tab i enter\n a teraz \\\"");
		System.out.printf("The answer for %.3f divided by %d is %.2f.\n", 5.45, 3, 5.45/3);
		/*
		 * %d		- integers
		 * %f		- floating points
		 * %n		- new line		  
		 * %%		- %
		 * %x or %X - int HEX
		 * %o		- int OCT
		 * %e %E	- Scientific notation
		 * %g		- Causes Formatter to use either %f or %e, whichever is shorter
		 * %t %T	- Time and Date
		 * %s %S	- String
		 * %h %H	- Hashcode of argument
		 * %c		- Character
		 * %b %B	- boolean
		 * %a %A	- Floating point HEX
		 */
		System.out.printf("String width 20,5 decimal places with k separator: %,20.5f",1200000.34);
		
		// input with Scanner
		Scanner scan = new Scanner(System.in);
		
		scan.close();
	}
}
