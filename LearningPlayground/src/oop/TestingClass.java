package oop;

import begining.SubModifierCheckOutPackage;

public class TestingClass {
	
	private String	privateString;
	protected String protectedString;
	public String publicString;
	String noModifierString; 
	
	protected static boolean isCallingfirst =  true;
	
	protected TestingClass(){
		this.privateString = "Private";
		this.protectedString = "Protected";
		this.noModifierString = "No Modifier";
		this.publicString	= "Public";
		
		//Ensures that recursion won't occur
		if(isCallingfirst) {
			isCallingfirst = false;
			new SubModifierCheckOutPackage();
			new SubModifierCheckInPackage();
		}
	}	
	
	public String getPrivateString() {
		return this.privateString;
	}
}
