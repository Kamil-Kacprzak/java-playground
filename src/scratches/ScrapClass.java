package scratches;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScrapClass {

	public static void main(String[] args) {
		
		List<Integer> matrix = new ArrayList<Integer>();
		Collections.addAll(matrix, 1,2,3,4);
		System.out.println(matrix);
		Collections.rotate(matrix, -1);
		System.out.println(matrix);
		
		Integer i = 5;
		List<Integer> list = new ArrayList<>();
		list.add(3);//Collections.singletonList(i);
		//list.add(1);
		String ii = "maslo:";
		System.out.println(list);
		change(list);
		System.out.println(list.toString());
		maxSimilarity(new ArrayList<Integer>(), new ArrayList<ArrayList<Integer>>());
	}

	private static void change(List<Integer> list) {
		list.add(5);
		list = new ArrayList<>();
		list.add(2);
	}                   

	public static <T> int maxSimilarity(ArrayList<T> g, ArrayList<? extends ArrayList<T>> gs) {
		System.out.println("Dzialam");
		return 0;
		
	}
}