package com.learning.functionalprogramming;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		BiConsumer<Integer,Integer> biConsumer=(s1,s2)->{
			System.out.println(s1+" "+s2);
		};
		
		biConsumer.accept(1,2);

	}

}
