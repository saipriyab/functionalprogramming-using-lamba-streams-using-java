package com.learning.functionalprogramming;

import java.util.stream.IntStream;

public class IterateExample {

	public static void main(String[] args) {
		IntStream.iterate(1, e -> e + 2).peek(System.out::println).limit(10).sum();

	}

}
