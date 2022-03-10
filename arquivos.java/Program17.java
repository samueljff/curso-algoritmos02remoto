package application;

import java.util.Locale;
import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;

		// Qual a or dem da matriz?
		System.out.print("what is the order of the matrix?: ");
		n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Elemento [%d, %d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nElementos acima da diagonal principal:");
		int somaAcima = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i<j) {
					somaAcima+=mat[i][j];
					System.out.printf("%d  ", mat[i][j]);
				}
			}
		}
		System.out.printf("\n\nSOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = %d\n", somaAcima);

		sc.close();
	}

}
