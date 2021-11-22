package learnjavainoneday.intermediate;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import learnjavainoneday.beginning.SubModifierCheckOutOfPackage;

public class TestingAccessClass {
	
	private String	privateString;
	protected String protectedString;
	public String publicString;
	String noModifierString; 
	// ArrayList -  better when there is a lot of searching especially by index
	// LinkedList -better for constant adding/removing items
	// Both lists can take only objects as parameters
	// By doing List<Integer> ll = new LinkedList<>(); - we only assign list implementation from linked list to our object	
	//		Implementation of other interfaces like queue or dequeue is not implemented in object
	List<Integer> al = new ArrayList<>();
	LinkedList<List<Integer>> llOfLists = new LinkedList<>();
	
	protected static boolean isCallingfirst =  true;
	
	protected TestingAccessClass(){
		llOfLists.add(al);
		
		this.privateString = "Private";
		this.protectedString = "Protected";
		this.noModifierString = "No Modifier";
		this.publicString	= "Public";
		
		//Ensures that recursion won't occur
		if(isCallingfirst) {
			isCallingfirst = false;
			new SubModifierCheckOutOfPackage();
			new SubModifierCheckInPackage();
		}
	}	
	
	public String getPrivateString() {
		return this.privateString;
	}
}