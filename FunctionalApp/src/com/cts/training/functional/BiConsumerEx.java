package com.cts.training.functional;

import java.util.List;
import java.util.function.BiConsumer;

import com.cts.training.modelanddata.Student;
import com.cts.training.modelanddata.StudentRepository;

public class BiConsumerEx {
	
	// BiConsumer that can display name and activities
	static BiConsumer<String, List<String>> displayNameAndActivity = (name, activity) -> System.out.println(name + " : " + activity);
	
	public static void printNameAndActivity() {
		List<Student> students = StudentRepository.getStudents();
		
		// create a Consumer on-the-fly
		students.forEach(student -> displayNameAndActivity.accept(student.getName(), student.getActivities()));
	}
	
	
	public static void main(String args[]) {
		BiConsumer<String, String> biConsumer = (str1, str2) -> {
			System.out.println(str1 + " : " + str2);
		};
		
		biConsumer.accept("Hello", "All");
		
		BiConsumer<Integer, Integer> multiply = (a, b) -> {
			System.out.println("Product : " + (a*b));
		};
		
		BiConsumer<Integer, Integer> addition = (a, b) -> {
			System.out.println("Addition : " + (a+b));
		};
		
		BiConsumer<Integer, Integer> division = (a, b) -> {
			System.out.println("Division : " + (a/b));
		};
		
		multiply.andThen(addition).andThen(division).accept(10, 5);
		
		printNameAndActivity();
		
	}
}
