package application;

import java.util.Locale;
import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, somaPares=0;
		System.out.print("how many numbers will you type? ");
		n = sc.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Enter the %dº number: ", i+1);
			vect[i] = sc.nextInt();
		}
		
		System.out.print("\nNumeros pares:  ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d  ", vect[i]);
				somaPares ++;
			}
		}
		
		System.out.println("\n\nQuantidade de pares: "+somaPares);

		sc.close();
	}

}
