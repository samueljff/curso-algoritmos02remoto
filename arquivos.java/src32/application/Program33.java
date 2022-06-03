package application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Program33 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Integer> list = Arrays.asList(3,4,3,10,5,7);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
				
		Stream<Integer> st2 = Stream.of(2,3,4,5,6);
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<String> st3 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st3.toArray()));
		
		Stream<Integer> st4 = list.stream().filter(x -> x < 5);
		System.out.println(Arrays.toString(st4.toArray()));
		
		Stream<Integer> st5 = list.stream().distinct();
		System.out.println(Arrays.toString(st5.toArray()));
		
		Stream<Integer> st6 = list.stream().sorted();
		System.out.println(Arrays.toString(st6.toArray()));
		
		Stream<Integer> st7 = list.stream().skip(2);
		System.out.println(Arrays.toString(st7.toArray()));
		
		Stream<Integer> st8 = list.stream().limit(3);
		System.out.println(Arrays.toString(st8.toArray()));
		
		Stream<Integer> st9 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st9.limit(10).toArray()));
		
		Stream<Long> st10 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st10.limit(10).toArray()));
	}
}
