package com.cts.training.optional;

import java.util.Optional;

import com.cts.training.functional.SupplierEx;
import com.cts.training.modelanddata.Student;

public class OptionalAltEx {

	public static String optionalOrElse() {
		// fetch student data from db(assume)
		// Optional<Student> student = Optional.ofNullable(SupplierEx.studentProvider.get());
		Optional<Student> student = Optional.ofNullable(null);
		
		String name = student.map(Student::getName).orElse("Dummy");
		
		return name;
	}
	
	public static String optionalOrElseGet() {
		// fetch student data from db(assume)
		//Optional<Student> student = Optional.ofNullable(SupplierEx.studentProvider.get());
		Optional<Student> student = Optional.ofNullable(null);
		
		String name = student.map(Student::getName).orElseGet(() -> "Dummy");
		
		return name;
	}
	
	public static String optionalOrElseThrow() {
		// fetch student data from db(assume)
		//Optional<Student> student = Optional.ofNullable(SupplierEx.studentProvider.get());
		Optional<Student> student = Optional.ofNullable(null);
		
		String name = student.map(Student::getName).orElseThrow(() -> new RuntimeException("No Student Data Available!!!"));
		
		return name;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Student name : " + optionalOrElse());
		System.out.println("Student name : " + optionalOrElseGet());
		System.out.println("Student name : " + optionalOrElseThrow());
	}

}
