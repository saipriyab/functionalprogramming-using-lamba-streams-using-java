package com.learning.functionalprogramming;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileExample {

	public static void main(String[] args) throws IOException {
		//fetch file
		Files.lines(Paths.get("D:\\projects\\FunctionalProgramming-using-lamba-streams-using-java\\src\\com\\learning\\functionalprogramming\\file.txt"))
		.map(str->str.split(" "))
		.flatMap(Arrays::stream)
        .distinct()
		.forEach(System.out::println);

		//fetch directory
		Files.list(Paths.get("D:\\projects\\FunctionalProgramming-using-lamba-streams-using-java")).forEach(System.out::println);
		
		//filter only directories
		Files.list(Paths.get("D:\\projects\\FunctionalProgramming-using-lamba-streams-using-java"))
		.filter(Files::isDirectory).forEach(System.out::println);
	}

}
