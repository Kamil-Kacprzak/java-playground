package learnjavainoneday.advanced;

public class AdvancedEntry {

	public static void main(String[] args) {
		MyGenericClass<Integer>  generic = new MyGenericClass<>();
		generic.setValue(5);
		System.out.println(generic.toString());
	}

}
