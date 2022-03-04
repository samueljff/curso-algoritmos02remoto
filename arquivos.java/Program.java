package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("Enter vector size: ");
		n = sc.nextInt();

		double sum = 0.0, media = 0.0;
		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Enter %dº number: ", i+1);
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}

		media = sum / n;
		System.out.printf("Media do vetor: %.3f\n", media);
		System.out.println("Elementos abaixo da media: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < media) {
				System.out.printf("%.1f\n", vect[i]);
			}
		}

		sc.close();

	}
}
