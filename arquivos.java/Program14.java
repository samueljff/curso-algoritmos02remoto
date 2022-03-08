package application;

import java.util.Locale;
import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int m, n;
		System.out.print("QTD LINHA: ");
		m = sc.nextInt();
		System.out.print("QTD COLUNA: ");
		n = sc.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Elemento [%d, %d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}
			System.out.println("\nValores negativos:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(mat[i][j]<0) {
					System.out.printf("posicao [%d, %d] = %d\n",i, j, mat[i][j]);
				}else {
					System.out.printf("posicao [%d, %d] = positivo\n",i, j);
				}
			}
		}

		sc.close();
	}

}
