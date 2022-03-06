package application;

import java.util.Locale;
import java.util.Scanner;

public class Program07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many elemnts will each vector have? ");
		int n = sc.nextInt();

		double average = 0.0, sum = 0.0;
		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Enter the %dº number: ", i + 1);
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}

		average = sum / n;
		System.out.printf("\nVector average: %.3f\n", average);
		System.out.println("\nBelow average elements:");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i]<average) {
				System.out.printf("%.1f\n", vect[i]);
			}
		}

		sc.close();
	}

}
