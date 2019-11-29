package com.cts.training.optional;

import java.util.Optional;

import com.cts.training.functional.SupplierEx;
import com.cts.training.modelanddata.Student;

public class OptionalEx {

	
	public static String getStudentName() {
		// assume a supplier getting a student record for db
		// Student student = SupplierEx.studentProvider.get();
		Student student = null;
		if(student != null)
			return student.getName();
		return null;
	}
	
	public static Optional<String> getStudentNameOptional() {
		// assume a supplier getting a student record for db
		// we should wrap object under Optional
		
		// Optional<Student> student = Optional.ofNullable(SupplierEx.studentProvider.get());
		Optional<Student> student = Optional.ofNullable(null);
		if(student.isPresent())
			return student.map(Student :: getName); // return Optional<String>
		
		return Optional.empty();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Student Name : " + getStudentName());
		
		System.out.println("Student Name : " + getStudentNameOptional());
	}

}
