package scratches;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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
		int __$12 = 12;
		if(__$12 == 10) {
			System.out.println(__$12);
		}
	//	long l = 20_000_000_000; compilation error
		long ll = 20_000_000_000L;
		System.out.println(ll);
		
//		Scanner sc = new Scanner(System.in);
//		sc.useDelimiter("\n");
//		int a1 = sc.nextInt();
//		System.out.println(a1);
		
		try (BufferedWriter out = new BufferedWriter(new FileWriter(new File("./src/learnjavainoneday/beginning","output.txt")))){
			out.write("otwarte");
			out.newLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
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