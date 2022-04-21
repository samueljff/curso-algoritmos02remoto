package application;

import java.util.Locale;
import java.util.Scanner;

import services.PrintService;

public class Progam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		PrintService<String> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Enter the º%d number: ", i+1);
			String value = sc.next();
			ps.addValue(value);
		}
		ps.print();
		String x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();
	}
}
