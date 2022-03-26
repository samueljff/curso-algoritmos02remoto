package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Progam19 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Invalid position!");
		}
		
		catch(InputMismatchException ex) {
			System.out.println("Input error!");
		}
		System.out.println("end of program!");
		
		sc.close();
	}
}
