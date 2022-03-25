package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char answer = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Icome: ");
			double anualIcome = sc.nextDouble();
			if (answer == 'i' || answer == 'I') {
				System.out.print("Health Expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIcome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberEmployee = sc.nextInt();
				list.add(new Company(name, anualIcome, numberEmployee));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0.0;

		for (TaxPayer tp : list) {
			System.out.println(tp.getName() + ": " + "$" + String.format("%.2f", tp.tax()));
			sum += tp.tax();
		}
		System.out.print("\nTOTAL TAXES: " + " $" + String.format("%.2f", sum));

		sc.close();
	}
}
