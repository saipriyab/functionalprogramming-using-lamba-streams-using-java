package com.learning.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class SquaresOfEvenNumbers {
	public static void main(String args[]) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		nums.stream().filter(num -> num % 2 == 0).map(num->num*num).forEach(System.out::println);
	}
}
