package learnjavainoneday.beginning;

import java.util.Arrays;
import java.util.Scanner;

public class BeginningEntry {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose your option:\n1 - Inline basic testing from functions\n2 - File testing\n0 - Exit");
		System.out.print("Your input: ");
		int option = scan.nextInt();
		scan.nextLine();
		switch (option)
		{
			case 0 :   
				System.out.println("Thank you for using our services. See you soon.");
				break;
			case 1: 
				int n = playingWithFormat();
				n = playingWithFlow(n);
				loopingAndException(n);
				break;
			case 2:
				FileTesting ft = new FileTesting();
				break;
			default:
				System.out.println("Wrong number.Shutting down.");
		}
		scan.close();
	}

	private static int playingWithFormat() {

		int n = 0;
		// Naming suffixes F/L or f/l
		float f = 20.5F; 
		long l = 20_000_000_000L; // without suffix, value is read as int - out of range 
		//Output:20000000000


		// Post/pre incrementation 
		System.out.println("Post incrementing: "+n++);
		System.out.println("Pre incrementing: "+(++n));

		// Narrowing conversion in unsafe manner 
		n = (int) l;
		System.out.println("New n: "+n);
		System.out.println("\t^ definitely out of boundry");
		System.out.println("L: "+l);
		n = 0;

		// Declare and initialize array separately in short syntax - not allowed
		int[] shortVersion = {3,2,1,0};
		int[] intArray;
		intArray = new int[] {3,2,1,0}; 

		// Without value filled with default value of a type
		int[] arr = new int[5];
		System.out.println("No initialization - value = "+arr[2]);

		Arrays.sort(intArray); 
		System.out.println("Sorted array: "+Arrays.toString(intArray)); // reference to object: intArray.toString()
		System.out.println(intArray[2]);

		//Escape sequence + string control with format specifiers
		System.out.println("\t tab i enter\n a teraz \\\"");
		System.out.printf("The answer for %.3f divided by %d is %.2f.\n", 5.45, 3, 5.45/3);
		/*
		 * Flags:
		 * %.x - x number of decimal places
		 * %x  - The minimal width of output with heading spaces
		 * %,  - Thousands separator
		 * Converters:
		 * %d		- integers
		 * %f		- floating points
		 * %n		- new line	(\n alternative)
		 * %s %S	- String
		 * %%		- %
		 * %x or %X - int HEX
		 * %o		- int OCT
		 * %e %E	- Scientific notation
		 * %g		- Causes Formatter to use either %f or %e, whichever is shorter
		 * %t %T	- Time and Date
		 * %h %H	- Hashcode of argument
		 * %c		- Character
		 * %b %B	- boolean
		 * %a %A	- Floating point HEX
		 */
		System.out.printf("String width 20,5 decimal places with \"thousands\" separator:%,20.5f\n",1200000.34);

		// input with Scanner
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int result = scan.nextInt();
		scan.hasNextLine();
		scan.close();
		return result;
	}

	private static int playingWithFlow(int n) {
		if ( n != 0 && 100/n <= 100) {  //logical operator (with no logic, lol)
			if(n >1 & n< 5) {			// bitwise operator - evaluate both sides (true or false) 
										// and performs AND operation on bits
				System.out.print("n is greater than 1 and smaller than 5.");				
			}else {
				switch(n) {
				case 100:
					break;
				case 200:
					break;
				default:
					return n>100?n:10;						
				}								
			}
		}
		return n; 
	}

	private static void loopingAndException(int n) {
		try {
			for (int i = n; i > 0; i--) {
				System.out.println(i);
				if(i == 2) {
					throw new ArrayIndexOutOfBoundsException();
				}
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No invalid index no message: "+e.getMessage());
			System.out.println("But I can show stack trace:");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Noting new in here so I through an exception");
			System.out.println("Key note: It's thrown in another Thread so after multiple runs - the order of lines may differ");
		}

	}
}