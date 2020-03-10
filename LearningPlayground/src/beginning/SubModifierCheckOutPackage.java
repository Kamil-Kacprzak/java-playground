package beginning;

// Main part of the program is located in this package where testing of modifiers is more detailed
import oop.TestingAccessClass;

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
