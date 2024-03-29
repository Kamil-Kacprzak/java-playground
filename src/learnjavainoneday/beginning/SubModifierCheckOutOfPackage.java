package learnjavainoneday.beginning;

import learnjavainoneday.intermediate.TestingAccessClass;

public class SubModifierCheckOutOfPackage extends TestingAccessClass{

	public SubModifierCheckOutOfPackage(){
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
