package com.cts.training.functional;

import java.util.List;
import java.util.function.Consumer;


import com.cts.training.modelanddata.Student;
import com.cts.training.modelanddata.StudentRepository;

public class ConsumerEx {
	
	// try to keep lambda implementations independent (reusable) 
	
	// Lambda implementation that can accept a student record and display the name
	static Consumer<Student> nameDisplayLambda = student -> System.out.println(student.getName());
	
	static Consumer<Student> nameDisplayUpperLambda = student -> System.out.print(student.getName().toUpperCase());
	
	static Consumer<Student> activityDisplayLambda = student -> System.out.println(student.getActivities());
	
	
	
	
	
	public static void printNames() {
		// to display only names of all Students
		
		// fetch student records
		List<Student> students = StudentRepository.getStudents();
		
		// students.forEach(<activity to perform during iteration>);
		students.forEach(nameDisplayLambda);
	}
	
	public static void printNameAndActivity() {
		// fetch student records
		System.out.println("\n Name and Activity ************");
		List<Student> students = StudentRepository.getStudents();
		
		students.forEach(nameDisplayLambda.andThen(activityDisplayLambda)); // chaining
		
		
		//students.forEach(activityDisplayLambda);
				
	}
	
	public static void printNameAndActivityUsingCondition() {
		System.out.println("\n Name and Activity Using Condition ************");
		List<Student> students = StudentRepository.getStudents();
		
		
		// inject a Consumer on-the-fly (lambda expression)
		students.forEach(student -> {
			if(student.getGrade() >= 3) {
				// call the lambdas through reference
				nameDisplayUpperLambda.andThen(activityDisplayLambda).accept(student);
			}
		});
	}
	
	
	
	public static void main(String args[]) {
		// define a consumer that can consume(accept) a string and display it in upper
		Consumer<String> toUpper = str -> System.out.println(str.toUpperCase());
		// Lambda expression being mapped to accept method
		toUpper.accept("Hello");
		
		printNames();
		
		printNameAndActivity();
		
		printNameAndActivityUsingCondition();
		
		
	}
}
