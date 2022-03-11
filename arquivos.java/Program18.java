package application;

import java.util.Locale;
import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;

		// Qual a ordem da matriz?
		System.out.print("what is the order of the matrix?: ");
		n = sc.nextInt();

		double[][] mat = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Elemento [%d, %d]: ", i, j);
				mat[i][j] = sc.nextDouble();
			}
		}

		double somaPositivo = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] > 0) {
					somaPositivo += mat[i][j];
				}
			}
		}

		System.out.printf("\nSoma dos positivos: %.2f\n", somaPositivo);
		System.out.print("\nEscolha uma linha: ");
		int line = sc.nextInt();
		System.out.print("Linha escolhida: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == line) {
					System.out.printf("%.1f  ", mat[i][j]);
				}
			}
		}
		
		System.out.print("\n\nEscolha uma coluna: ");
		int collumn = sc.nextInt();
		System.out.print("Coluna escolhida: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == collumn) {
					System.out.printf("%.1f  ", mat[i][j]);
				}
			}
		}
		System.out.print("\n\nDiagonal Principal: ");
		for(int i = 0; i<n; i++) {
			System.out.printf("%.1f  ", mat[i][i]);
		}
		System.out.println();
		System.out.println("\nMatriz alterada:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(mat[i][j]<0)
					mat[i][j] = Math.pow(mat[i][j], 2);
					System.out.printf("%.1f   ", mat[i][j]);
			}
			System.out.println();
		}

		sc.close();
	}

}
