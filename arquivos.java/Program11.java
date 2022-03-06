package application;

import java.util.Locale;
import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// serão digitados dados de quantos produtos
		System.out.print("will be entered data of how many products: ");
		int n = sc.nextInt();

		int abaixo = 0, acima = 0, entre = 0;
		double vlrTotalCompra = 0.0, vlrTotalVenda = 0.0, lucroTotal = 0.0;
		String[] name = new String[n];
		double[] precCompra = new double[n];
		double[] precVenda = new double[n];
		double[] porcLucro = new double[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Produto %d\n", i + 1);
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			System.out.print("Preco de compra: ");
			precCompra[i] = sc.nextDouble();
			System.out.print("Preco de venda: ");
			precVenda[i] = sc.nextDouble();
		}

		for (int i = 0; i < n; i++) {
			porcLucro[i] = (precVenda[i] - precCompra[i]) / precCompra[i] * 100.0;
			if (porcLucro[i] < 10.0) {
				abaixo++;
			} else if (porcLucro[i] < 20) {
				entre++;
			} else {
				acima++;
			}
		}

		for (int i = 0; i < n; i++) {
			vlrTotalCompra += precCompra[i];
			vlrTotalVenda += precVenda[i];
		}

		lucroTotal = vlrTotalVenda - vlrTotalCompra;

		System.out.println("\nRELATORIO:");
		System.out.printf("Lucro abaixo de 10%%: %d\n", abaixo);
		System.out.printf("Lucro entre 10%% e 20%%: %d\n", entre);
		System.out.printf("Lucro acima de 20%%: %d\n", acima);
		System.out.printf("Valor total de compra: %.2f\n", vlrTotalCompra);
		System.out.printf("Valor total de venda: %.2f\n", vlrTotalVenda);
		System.out.printf("Lucro total: %.2f\n", lucroTotal);

		sc.close();
	}

}
