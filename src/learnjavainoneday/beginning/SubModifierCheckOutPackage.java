package learnjavainoneday.beginning;

import learnjavainoneday.intermediate.TestingAccessClass;

public class SubModifierCheckOutPackage extends TestingAccessClass{

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
