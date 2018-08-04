package com.edu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test3 {
	public static void main(String[] args) {
		
		IntStream 
		.range(1,10)
		.forEach(System.out::print);
		System.out.println();
		//Integer Stream with skip
		
		IntStream
		.range(1,10)
		.skip(5)
		.forEach(x->System.out.println(x));
		
		System.out.println();
		//Integer Stream with sum
		System.out.println(
				
				IntStream 
				.range(1, 5)
				.sum());
				System.out.println();
				
				//Stream.of,sorted and findFirst
				Stream.of("Tabrez","Tqsmen","Tnmen")
				.sorted()
				.findFirst()
				.ifPresent(System.out::println);
				//Stream from Array,sort,filter,and print
				String[] names= {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
				Arrays.stream(names)//same as stream.of(names)
				.filter(x->x.startsWith("S"))
				.sorted()
				.forEach(System.out::println);
				
				//Average of Square of an int array
				Arrays.stream(new int[] {2,4,6,8,10})
				.map(x->x*x)
				.average()
				.ifPresent(System.out::println);

				
				//Stream from List,filter and print
				List<String>people=Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
				people
				.stream()
				.map(String::toLowerCase)
				.filter(x->x.startsWith("a"))
				.forEach(System.out::println);
			
				
		
	}

}
