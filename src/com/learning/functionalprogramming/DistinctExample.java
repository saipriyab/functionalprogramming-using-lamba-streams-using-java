package com.learning.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,1,2,3,4,4,5);
		list.stream().distinct().forEach(System.out::println);

	}

}
