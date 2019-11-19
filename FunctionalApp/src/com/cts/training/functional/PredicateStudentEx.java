package com.cts.training.functional;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.cts.training.modelanddata.Student;
import com.cts.training.modelanddata.StudentRepository;

public class PredicateStudentEx {

	static Predicate<Student> filterOnGrade = student -> student.getGrade() >= 3;
	
	static Predicate<Student> filterOnGpa = student -> student.getGpa() >= 3.9;
	
	public static void filterRecordsOnGrade() {
		List<Student> students = StudentRepository.getStudents();
		List<Student> filteredStudents =  students.stream()
				.filter(filterOnGrade)
				.collect(Collectors.toList());
				
		System.out.println(filteredStudents);
	}
	
	public static void filterRecordsOnGpa() {
		List<Student> students = StudentRepository.getStudents();
		
		students.forEach(student -> {
			if(filterOnGpa.test(student))
				System.out.println(student);
		});
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		filterRecordsOnGrade();
		
		filterRecordsOnGpa();

	}

}
