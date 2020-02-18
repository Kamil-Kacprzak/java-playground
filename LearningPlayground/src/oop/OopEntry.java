package oop;


public class OopEntry { // only public, abstract and final modifiers allowed 
						// in general class
/*
 * 			Access Levels
------------------------------------------------|
Modifier	Class	Package	Subclass	World	|
-----------|------------------------------------|
public	   |  Y			Y		Y			Y	|
protected  |  Y			Y		Y			N	|
no modifier|  Y 		Y		N			N	|
private	   |  Y			N		N			N	|
------------------------------------------------|

 */

	
	// BAD EXAMPLE 
	// Mixing logic with program entry
	// Using class with main and calling new object with
	// it's own constructor
	public static void main(String[] args) {
		// new OopEntry();
		new TestingClass();	
	}

//	OopEntry(){
//		System.out.println("Calling non static methods from here");
//	}
}
