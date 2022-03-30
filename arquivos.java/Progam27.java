package application;

import java.io.File;
import java.util.Scanner;

public class Progam27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a file path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		
		System.out.println("Get name: "+path.getName());
		System.out.println("Get parent: "+path.getParent());
		System.out.println("Get path: "+path.getPath());
		
		sc.close();
	}
}
