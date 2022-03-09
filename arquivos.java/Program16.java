package application;

import java.util.Locale;
import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int m,n;
		// Quantas linhas vai ter cada matriz? 
		System.out.print("How many rows will each matrix have?: ");
		m = sc.nextInt();
		//Quantas colunas vai ter cada matriz?
		System.out.print("How many columns will each matrix have?: ");
		n = sc.nextInt();

		int[][] matA = new int[m][n];
		int[][] matB = new int[m][n];
		int[][] matc = new int[m][n];

		System.out.println("\nElementos da matriz A:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Elemento [%d, %d]: ", i, j);
				matA[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Elementos da matriz B:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Elemento [%d, %d]: ", i, j);
				matB[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nMatriz soma:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matc[i][j] = matA[i][j] + matB[i][j]; 
				System.out.printf("%d  ",matc[i][j]);
			}
			System.out.println();
		}

		sc.close();
	}

}
