package learnjavainoneday.intermediate;

import java.util.Scanner;

import learnjavainoneday.beginning.FileTesting;

public class OopEntry { // only public (or no modifier), abstract and final modifiers allowed 
						// in general class
/*
 * 			Access Levels
------------------------------------------------|
Modifier	Class	Package	Subclass	World	|
-----------|------------------------------------|
public	   |  Y			Y		Y			Y	|
protected  |  Y			Y		Y			N	|
no modifier|  Y 		Y		N			N	| // not used for fields and methods within interface
private	   |  Y			N		N			N	|
------------------------------------------------|

 */

	
	// BAD EXAMPLE 
	// Mixing logic with program entry
	// Using class with main and calling new object with
	// it's own constructor
	public static void main(String[] args) {
		// new OopEntry();
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose your option:\n1 - TestingClass entry\n2 - Abstract & Interface\n0 - Exit");
		System.out.print("Your input: ");
		int option = scan.nextInt();
		scan.nextLine();
		switch (option)
		{
			case 0 : 
				System.out.println("Thank you for using our services. See you soon.");
				break;
			case 1: 
				new TestingAccessClass();	
				break;
			case 2:
				IfceAbstractClassUser user = new IfceAbstractClassUser();
				user.calculateNumber();
				user.returnNumber();
				user.someDefaultMethod();
				AbstractClass.someStaticMethod();
				TrialInterface.someStaticMethod();
				break;
			default:
				System.out.println("Wrong number.Shutting down.");
		}
		scan.close();		
	}

//	OopEntry(){
//		System.out.println("Calling non static methods from here");
//	}
}
