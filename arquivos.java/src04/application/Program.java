package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date birth = sdf.parse(sc.next());
		Client cli = new Client(name, email, birth);

		System.out.println("Enter Order Data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, cli);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Enter #" +i+ " item data:");
			System.out.print("Product Name: ");
			String productName = sc.nextLine();
			System.out.print("Product Price: ");
			double ProductPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			//Product product = new Product(productName, ProductPrice);
			OrderItem it = new OrderItem(quantity, ProductPrice, new Product(productName, ProductPrice));
			order.addItem(it);
		}

		System.out.println();
		System.out.println("ORDER SUMMARY:\n");
		System.out.println(order);

		sc.close();
	}

}
