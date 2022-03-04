package application;

import java.util.Locale;
import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// ( quantas pessoas serão digitadas? ).
		System.out.print("How many people will be entered? ");
		int n = sc.nextInt();
		int menor = 0;
		double sum = 0.0, avg = 0.0, percent = 0.0;
		String[] name = new String[n];
		double[] age = new double[n];
		double[] height = new double[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			// ( dados da 1º pessoa )
			System.out.printf("%dº Person data:\n", i + 1);
			System.out.print("Name: ");
			name[i] = sc.nextLine();
			System.out.print("Age: ");
			age[i] = sc.nextDouble();
			System.out.print("Height: ");
			height[i] = sc.nextDouble();

			sum += height[i];

			if (age[i] < 16) {
				menor++;
			}
		}

		avg = sum / n;
		percent = (double) menor / n * 100;

		System.out.printf("Average: %.2f\n", avg);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percent);
		for (int i = 0; i < n; i++) {
			if (age[i] < 16) {
				System.out.printf("%s\n", name[i]);
			}
		}

		sc.close();
	}

}
