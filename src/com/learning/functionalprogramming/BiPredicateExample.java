package com.learning.functionalprogramming;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {

		BiPredicate<Integer, String> biPredicate = (num, str) -> {
			return num < 10 && str.length() > 3;
		};

		System.out.println(biPredicate.test(18, "hello"));

	}

}
