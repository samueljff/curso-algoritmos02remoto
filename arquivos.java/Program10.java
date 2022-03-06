package application;

import java.util.Locale;
import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("how many people will be entered: ");
		int n = sc.nextInt();
		int qtdHomens = 0, qtdMulheres = 0;
		double maioralt, menoralt, mediaAltMulheres, altFemTotal = 0.0;

		double[] height = new double[n];
		char[] genero = new char[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %dº pessoa\n", i + 1);
			System.out.print("Height: ");
			height[i] = sc.nextDouble();
			System.out.print("Genero: ");
			genero[i] = sc.next().charAt(0);
		}

		maioralt = height[0];
		menoralt = height[0];
		for (int i = 0; i < n; i++) {
			if (height[i] > maioralt) {
				maioralt = height[i];
			}
			if (height[i] < menoralt) {
				menoralt = height[i];
			}
			if (genero[i] == 'f' || genero[i] == 'F') {
				qtdMulheres++;
				altFemTotal += height[i];
			} else {
				qtdHomens++;
			}
		}

		mediaAltMulheres = altFemTotal / qtdMulheres;
		System.out.printf("\nMenor altura: %.2f\n", menoralt);
		System.out.printf("Maior altura: %.2f\n", maioralt);
		System.out.printf("Media das alturas das mulheres: %.2f\n", mediaAltMulheres);
		System.out.printf("Numero de homens: %d\n", qtdHomens);

		sc.close();
	}

}
