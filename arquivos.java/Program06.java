package application;

import java.util.Locale;
import java.util.Scanner;

public class Program06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Quantos valores vai ter cada vetor?
		System.out.print("how many values will each vector have? ");
		int n = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		System.out.println("\nvector values ​​a:");
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter the number for %dº position: ", i + 1);
			a[i] = sc.nextInt();

		}

		System.out.println();
		
		System.out.println("vector values ​​b:");
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter the number for %dº position: ", i + 1);
			b[i] = sc.nextInt();
		}
		
		System.out.println("\nresulting vector:");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d\n", c[i] = a[i] + b[i]);
		}
		
		sc.close();
	}

}
