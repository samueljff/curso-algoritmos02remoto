package application;

import java.util.Locale;
import java.util.Scanner;

public class Program08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many people will you type: ");
		int n = sc.nextInt();

		int older;
		String name;
		int[] idade = new int[n];
		String[] nome = new String[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Dados da %dº pessoa\n", i + 1);
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}

		older = idade[0];
		name = nome[0];
		for (int i = 0; i < n; i++) {
			if (idade[i] > older) {
				older = idade[i];
				name = nome[i];
			}
		}
		
		System.out.printf("\nolder person: %s\n", name);

		sc.close();
	}

}
