package com.learning.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class CountCharacters {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("hello", "bye");
		list.stream().map(course -> course + " " + course.length()).forEach(System.out::println);
	}

}
