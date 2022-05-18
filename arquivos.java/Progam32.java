package application;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Progam32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("userName", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("fhone", "99711122");
		
		cookies.remove("email");
		
		cookies.put("fhone", "99771133");
		System.out.println("Contains 'fhone' key: " + cookies.containsKey("fhone"));
		System.out.println("Phone number: " + cookies.get("fhone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("All Cookies:");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

		System.out.println("Valores: " + cookies.values());
		
		sc.close();
	}
}
