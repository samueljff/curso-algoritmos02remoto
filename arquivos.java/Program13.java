package application;

import java.util.Locale;
import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m, n;
		System.out.print("Digite a quantidade de linhas: ");
		m = sc.nextInt();
		System.out.print("Digite a quantidade de colunas: ");
		n = sc.nextInt();

		double[][] mat = new double[m][n];
		double[] vect = new double[m];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%dº Linha %dº Coluna: ", i + 1, j + 1);
				mat[i][j] = sc.nextDouble();
			}
		}

		System.out.println("\nVetor Gerado:");
		for (int i = 0; i < mat.length; i++) {
			int somaLinha = 0;
			for (int j = 0; j < n; j++) {
				somaLinha += mat[i][j];

			}
			vect[i] = somaLinha;
			System.out.println(vect[i]);
		}
		sc.close();
	}

}
