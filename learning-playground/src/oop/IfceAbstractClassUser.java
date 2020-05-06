package oop;

public class IfceAbstractClassUser extends AbstractClass
					implements TrialInterface{

	//Default constructor
	
	@Override
	public void returnNumber() {
		System.out.println("Number from interface: "+TrialInterface.number);
	}

	@Override
	public void calculateNumber() {
		super.number *=2;
		System.out.println("Abstract class number equals now: "+super.number);
	}
	
	@Override
	public void someDefaultMethod() {
		System.out.println("This is a default method in a class that implements the interface"); 
	}

}
