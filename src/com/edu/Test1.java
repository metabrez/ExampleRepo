package com.edu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {

		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);

		for (Map.Entry<String, Integer> entry : items.entrySet()) {

			System.out.println("Item : " + entry.getKey() + " count : " + entry.getValue());
		}

		/*
		 * Java 8 Example
		 */

		items.forEach((K, V) -> {

			System.out.println("Item : " + K + "Count : " + V);

			if ("D".equals(K)) {

				System.out.println("Hello E");

			}

		});

		/*
		 * Java lamabda exmaple
		 */

		items.forEach((K, V) -> System.out.println("Items : " + K + " Count " + V));

		List<String> items1 = new ArrayList<>();

		items1.add("A");
		items1.add("B");
		items1.add("C");
		items1.add("D");

		/*
		 * Lambada
		 */

		items1.forEach(item -> System.out.println(item));

		/*
		 * Lambada with foreach
		 */

		items1.forEach(item -> {
			if ("B".equals(item)) {

				System.out.println("Tabrez");
			}
		});
		
		/*
		 * Stream and filter
		 */
		
		items1.stream()
		.filter(s->s.contains("B"))
		.forEach(System.out::println);
	}
}
