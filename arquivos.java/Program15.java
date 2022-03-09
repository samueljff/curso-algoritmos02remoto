package application;

import java.util.Locale;
import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		// quantos elementos da matriz serão digitados
		System.out.print("how many array elements will be typed: ");
		n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Elemento [%d, %d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nMaior elemento de cada linha:");
		for (int i = 0; i < n; i++) {
			int maiorElemento = mat[0][0];
			for (int j = 0; j < n; j++) {
				if (mat[i][j] > maiorElemento) {
					maiorElemento = mat[i][j];
				}
			}
			System.out.println(maiorElemento);
		}

		sc.close();
	}

}
