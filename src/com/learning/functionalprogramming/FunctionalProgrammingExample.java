package com.learning.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class FunctionalProgrammingExample {

	public static void main(String args[])
	{
		List<Integer> nums=Arrays.asList(1, 2, 3,4,5);
		nums.stream().forEach(System.out::println);
	}
}
