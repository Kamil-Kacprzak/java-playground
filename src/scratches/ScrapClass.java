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
		List<Integer> list = Collections.singletonList(i);
		//list.add(1);
		i = 10;
		System.out.println(list);
		
	}                   

}