package application;

import java.util.Arrays;
import java.util.List;

public class Progam28 {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("\n\nMaria", "Alex", "Bob");
		printList(myStrs);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print("   "+obj);
		}
	}
}
