package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Progam20 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		method1();
		System.out.println("end of program!");
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}

	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Invalid position!");
			ex.printStackTrace();
			sc.next();
		}

		catch (InputMismatchException ex) {
			System.out.println("Input error!");
		}

		sc.close();
		System.out.println("***METHOD2 END***");
	}
}
