package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Progam22 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		File file = new File("C:\\Users\\samuel\\Desktop\\Teste html\\MeuEstilo.css");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: "+e.getMessage());
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
		
		sc.close();
	}
}
