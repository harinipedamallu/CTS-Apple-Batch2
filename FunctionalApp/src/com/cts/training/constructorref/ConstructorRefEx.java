package com.cts.training.constructorref;

import java.util.function.Function;
import java.util.function.Supplier;

import com.cts.training.modelanddata.Student;

public class ConstructorRefEx {
	
	// lambda of supplier that returns back an blank student object
	static Supplier<Student> studentProvider = () -> new Student();  // going to call constructor
	
	static Supplier<Student> studentProviderPro = Student :: new; // default constructor
	
	static Function<String, Student> studentIntializer = Student :: new;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(studentProviderPro.get());
		System.out.println(studentIntializer.apply("Dummy Student"));

	}

}
