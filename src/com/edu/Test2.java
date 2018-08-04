/*package com.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test2 {
	public static void main(String[] args) {
		
		List<String> lines=Arrays.asList("Spring","Java","Tabrez");
		List<String> result=getFilterOutput(lines,"Tabrez");
		for(String temp:result) {
			System.out.println(temp);
			
		}
		
		
	}

	private static List<String> getFilterOutput(List<String> lines, String name) {
		List<String> result=new ArrayList<>();
		for(String line:lines) {
			
			if(!"Tabrez".equals(line)) {
				
				result.add(line);
			}
		}
		return result;}
	
		
		
		 * Same exmaple ins JAva 8
		 
		
		List<String> result1=lines.stream()
				.filter(line->!"Tabrez".equals(line))
				.collect(Collectors.toList());
		result.forEach(System.out::println);
	}

}
}*/