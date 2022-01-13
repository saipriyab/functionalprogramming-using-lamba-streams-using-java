package com.learning.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class CalculateSum {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(nums.stream().reduce(0, (a, b) -> (a + b)));
        System.out.println(nums.stream().reduce(0,Integer::sum));
	}

}
