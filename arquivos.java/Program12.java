package application;

import java.util.Locale;
import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// digite a quantidad de dados da matriz
		System.out.print("enter the amount of data in the matrix: ");
		int n = sc.nextInt();

		int count = 0;
		int[][] mat = new int[n][n];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				if(mat[i][j]<0) {
					count++;
				}
			}
		}
		
		System.out.println("Diagonal Principal:");
		for(int i = 0; i<n; i++) {
			System.out.print(mat[i][i]+" ");
		}
		
		System.out.println("\nNegative numbers: "+count);

		sc.close();
	}

}
