package begining;

import oop.TestingClass;

public class SubModifierCheckOutPackage extends TestingClass{

	public SubModifierCheckOutPackage(){
		super();
		printData();
	}

	private void printData() {
		System.out.println("ModifierCheck out of the package: ");
		System.out.print(publicString+"\t");
		// Not visible !
		// System.out.print(noModifierString+"\t"); 
		System.out.print(protectedString+"\t");
		System.out.print(getPrivateString()+"\n");		
	}
}
