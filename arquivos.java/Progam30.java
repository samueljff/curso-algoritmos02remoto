package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Progam30 {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>();
		set.add("Tv");
		set.add("Tablet");
		set.add("Calculadora");
		set.add("ce");
		
		set.remove("Tablet");
		set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');
		
		set.add("Notebook");
		System.out.println(set.contains("Notebook"));
		for (String p : set) {
			System.out.println(p);
		}
	}
}
