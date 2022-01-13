package com.learning.functionalprogramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("hello","hi","byebye");
		list.stream().sorted(Comparator.comparing(str->str.length())).forEach(System.out::println);

	}

}
