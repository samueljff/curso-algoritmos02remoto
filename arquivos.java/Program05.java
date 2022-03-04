package application;

import java.util.Locale;
import java.util.Scanner;

public class Program05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, posMaior;
		double maior;
		System.out.print("how many numbers will you type? ");
		n = sc.nextInt();

		double[] vect = new double[n];
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Digite o %dº numero", i + 1);
			vect[i] = sc.nextDouble();
		}

		maior = vect[0];
		posMaior = 0;

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				posMaior = i;
			}
		}
		
		System.out.printf("\nMaior valor: %.2f\n", maior);
		System.out.printf("Posicao do maior valor: %d", posMaior);

		sc.close();
	}

}
