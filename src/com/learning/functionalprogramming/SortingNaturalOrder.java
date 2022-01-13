package com.learning.functionalprogramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingNaturalOrder {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(6,1,1,2,3,4,4,5);
		list.stream().distinct().sorted(Comparator.naturalOrder()).forEach(System.out::println);


	}

}
