package begining;

import java.util.Arrays;
import java.util.Scanner;

public class Testing {
	
	public static void main(String[] args) {
		
		int n = playingWithFormat();
		n = playingWithFlow(n);
		loopingAndException(n);
	}

	private static int playingWithFormat() {

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
		System.out.println("\t^ definitely out of boundry");
		System.out.println("L: "+l);
		n = 0;
		
		// Declare and initialize array separately in short syntax - not allowed
		int[] intArray;
		intArray = new int[] {3,2,1,0};
		
		Arrays.sort(intArray);
		System.out.println("Sorted array: "+Arrays.toString(intArray)); // reference to object: ntArray.toString()
		System.out.println(intArray[2]);
		
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
		System.out.printf("String width 20,5 decimal places with \"thousands\" separator: %,20.5f\n",1200000.34);
		
		// input with Scanner
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int result = scan.nextInt();
		scan.hasNextLine();
		scan.close();
		return result;
	}

	private static int playingWithFlow(int n) {
		if ( n != 0 && 100/n <= 100) { //logical operator
			if(n >1 & n< 5) {			// bitwise operator - evaluate both side 
										// and perform AND operation on bits
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
			System.out.println("But I can show this:");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Noting new in here so I through an exception");
			System.out.println("Key note: It's thrown in another Thread");
		}
		
	}
}
