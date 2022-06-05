package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program33 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Employee> list = new ArrayList<>();
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				String email = fields[1];
				double salary = Double.parseDouble(fields[2]);
				list.add(new Employee(name, email, salary));
				line = br.readLine();
			}
			System.out.print("Enter salary: ");
			double salaryBase = sc.nextDouble();
			
			List<String> names = list.stream()
					.filter(p -> p.getPrice() > salaryBase)
					.map(p -> p.getEmail())
					.sorted()
					.collect(Collectors.toList());
			System.out.printf("\nEmail of people whose salary is more than %.2f:\n", salaryBase);
			names.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(p -> p.getName().charAt(0) == 'M')
					.map(p -> p.getPrice())
					.reduce(0.0, (x,y) -> x + y);
			System.out.print("\nSum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
			
		} catch (IOException e) {
			System.out.println("Errror: " + e.getMessage());
		}
		
		sc.close();
	}
}
