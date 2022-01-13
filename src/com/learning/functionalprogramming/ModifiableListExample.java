package com.learning.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class ModifiableListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("abc","def");
		list.replaceAll(String::toUpperCase);
		list.forEach(System.out::println);

	}

}
