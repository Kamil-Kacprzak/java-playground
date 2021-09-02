package learnjavainoneday.intermediate;

public class SubModifierCheckInPackage extends TestingAccessClass{

	public SubModifierCheckInPackage(){
		printData();
	}

	private void printData() {
		System.out.println("ModifierCheck in package: ");
		System.out.print(publicString+"\t");
		System.out.print(noModifierString+"\t");
		System.out.print(protectedString+"\t");
		System.out.print(getPrivateString()+"\n");		
	}
}
