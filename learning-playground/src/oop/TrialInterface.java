package oop;

public interface TrialInterface {

	int number = 10;
	void returnNumber();
	
	public static void someStaticMethod()  {  
		System.out.println("This is a static method in an interface"); 
	}  
	
	public default void someDefaultMethod()  { 
		System.out.println("This is a default method in an interface"); 
	}
}
