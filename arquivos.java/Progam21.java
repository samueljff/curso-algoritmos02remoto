package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Progam21 {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\samuel\\Desktop\\Teste html\\MeuEstilo.css");
		Scanner sc = null;

		try {
			sc = new Scanner(file);

			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException ef) {
			System.out.println("Error opening file!" + ef.getMessage());
		} finally {

			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally block executed!");
		}
	}
}
