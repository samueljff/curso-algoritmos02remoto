package application;

import java.util.Locale;
import java.util.Scanner;

public class Program09 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("how many students will be entered: ");
		int n = sc.nextInt();

		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		String[] name = new String[n];
		double avg = 0.0;

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Dados do %dº aluno\n", i + 1);
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			System.out.print("Nota1: ");
			nota1[i] = sc.nextDouble();
			System.out.print("Nota2: ");
			nota2[i] = sc.nextDouble();
		}

		System.out.println("\nAlunos aprovados:");
		for (int i = 0; i < n; i++) {
			avg = (nota1[i] + nota2[i]) / 2;
			if(avg>=6.0) {
				System.out.printf("%s\n", name[i]);
			}
		}

		sc.close();
	}

}
