package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char answer = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value Per Hours: ");
			double valuePerHours = sc.nextDouble();

			if (answer == 'y' || answer == 'Y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge));
			} else {
				list.add(new Employee(name, hours, valuePerHours));
			}
		}

		System.out.println();
		System.out.println("Payments: ");
		for(Employee emp : list) {
			System.out.println(emp.getName()+" - $" + String.format("%.2f", emp.payment()));
		}
		sc.close();
	}

}
