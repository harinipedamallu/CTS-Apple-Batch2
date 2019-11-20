package com.cts.training.methodref;

import java.util.function.Consumer;

import com.cts.training.modelanddata.Student;
import com.cts.training.modelanddata.StudentRepository;

public class ConsumerMethodRefEx {

	
	// Consumer lambda to accept a student record and display it
	// static Consumer<Student> displayStudent = (student) -> System.out.println(student);
	
	// System.out.println()  has the prototype same as abstract method of Consumer
	static Consumer<Student> displayStudent = System.out :: println;

	
	static Consumer<Student> displayActivities = student -> student.printAllActivities();
	
	
	static Consumer<Student> displayActivitiesPro = Student :: printAllActivities;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRepository.getStudents().forEach(displayStudent);
		StudentRepository.getStudents().forEach(displayActivities);
		System.out.println("Through method reference...");
		StudentRepository.getStudents().forEach(displayActivitiesPro);
		
	
	}

}
