package com.learning.functionalprogramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", category=" + category + ", reviewScore=" + reviewScore + ", noOfStudents="
				+ noOfStudents + "]";
	}

}

public class CustomClass {

	public static void main(String[] args) {
		List<Course> courses = Arrays.asList(new Course("spring", "framework", 50, 100),
				new Course("springboot", "framework", 50, 200));

		System.out.println(courses.stream().allMatch(course -> course.getNoOfStudents() > 100));
		System.out.println(courses.stream().noneMatch(course -> course.getNoOfStudents() > 100));
		System.out.println(courses.stream().anyMatch(course -> course.getNoOfStudents() > 100));

		Comparator<Course> comparingByNoOfStudents = Comparator.comparing(Course::getNoOfStudents);
		courses.stream().sorted(comparingByNoOfStudents).collect(Collectors.toList()).forEach(System.out::println);

		Comparator<Course> comparingByNoOfStudentsReverseOrder = Comparator.comparing(Course::getNoOfStudents)
				.reversed();
		courses.stream().sorted(comparingByNoOfStudentsReverseOrder).collect(Collectors.toList())
				.forEach(System.out::println);

		Comparator<Course> comparingByNoOfStudentsAndReviews = Comparator.comparing(Course::getNoOfStudents)
				.thenComparing(Course::getReviewScore);
		courses.stream().sorted(comparingByNoOfStudentsAndReviews).skip(1).limit(2).collect(Collectors.toList())
				.forEach(System.out::println);

		// collect all those whoch has review score has 100
		// Stream.of(1,2,3,4,5,6,7,8,9,10,9,8,7,6,5,4,3,2,1)
		// .takeWhile(i -> i < 4 )
		// .forEach(System.out::print);
		
		System.out.println(courses.stream().max(comparingByNoOfStudentsAndReviews));
		System.out.println(courses.stream().min(comparingByNoOfStudentsAndReviews));
		

	}

}
