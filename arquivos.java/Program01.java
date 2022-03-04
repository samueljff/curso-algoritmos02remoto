package application;

import java.util.Locale;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, somaVetor = 0;
		System.out.println("How many values ​​will each vector have? ");
		n = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Enter the %dº value for a: ", i + 1);
			a[i] = sc.nextInt();
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter the %dº value for b: ", i + 1);
			b[i] = sc.nextInt();
		}

		System.out.println("\nVetor Resultante!");
		for (int i = 0; i < n; i++) {
			c[i] = a[i] + b[i];
			System.out.printf("%d\n", c[i]);
		}

		sc.close();

	}
}
