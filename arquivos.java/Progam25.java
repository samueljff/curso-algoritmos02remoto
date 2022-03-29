package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Progam25 {

	public static void main(String[] args) {

		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		String path = "C:\\Projetos02\\arquivo_de_teste\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
