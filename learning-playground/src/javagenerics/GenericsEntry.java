package javagenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GenericsEntry {

	public static void main(String[] args) {
		varArgsOperation();
		basicGenericsOperations();

	}


	public static void basicGenericsOperations() {
		// Extends and super not legal in one expression!		
		// Extends don't promise immutability 	
		
		// Don't use any for both put and get
		List<Integer> allActions = new ArrayList<Integer>();
		allActions.add(1);
		int value = allActions.get(0);
		if(value == 1) {
			System.out.println("No wildcards - all actions permited\n");
		}

		// Use super for put operations
		List<? super Integer> superNums = new ArrayList<>();
		superNums.add(1);
		superNums.add(2);
		/* 
		 * only exception when reading "Object"s because
		 * it's a super type to all reference types
		*/
		List<Object> objs = Arrays.<Object>asList(1, "two");
		superNums = objs;

		String s = "";
		for (Object obj : superNums) {
			s += obj.toString();
		}
		System.out.println("Super for put operations\nI got values from super list only because it refers to objects: "+s+"\n");

		
		// Use extend for get operation
		List<? extends Number> extendedNums = Arrays.asList(1, 2, 3.14);
		System.out.printf("Basic sum equals: %.2f\n", sum(extendedNums));

		List<Integer> ints = new ArrayList<Integer>();
		ints.add(3);
		ints.add(4);		
		extendedNums = ints;
		System.out.printf("After reasigning sum equals: %.2f\nI cannot add elements to this list\n", sum(extendedNums));
		// extendedNums.add(5); // illegal operation - can't guarantee a type of list

		/*
		 * Only exception is for adding null
		 * it belongs to all reference types
		 */
		extendedNums.add(null);
		System.out.printf("Super for get operations exception\nI added value (null - subtype to all types) to extended list befor sum, which equals: %.2f\n", sum(extendedNums));
	}

	public static double sum(Collection<? extends Number> nums) {
		double s = 0.0;
		for (Number num : nums) {
			if (num != null) {
				s += num.doubleValue();
			}
		}
		return s;
	}
	
	private static void varArgsOperation() {
		List<String> words = toList(1, "number", "was", "checked", "first");
		for (String word : words) {
			System.out.println("varargs next word: "+word);
		}
		System.out.println();
	}
	
	public static <T> List<T> toList(int num, T... arr){
		List<T> list = new ArrayList<T>();
		if(num == 1) {
			for (T elt : arr ) {
				list.add(elt);
			}			
		}
		return list;
	}

}
