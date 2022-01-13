package com.learning.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class SortedExample {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(6,1,1,2,3,4,4,5);
		list.stream().distinct().sorted().forEach(System.out::println);


	}

}
