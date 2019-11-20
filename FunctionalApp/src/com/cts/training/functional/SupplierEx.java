package com.cts.training.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.cts.training.modelanddata.Student;
import com.cts.training.modelanddata.StudentRepository;

public class SupplierEx {
	
	// lambda supplier that can initiate/create a new student record and return
	public static Supplier<Student> studentProvider = () -> {
		return new Student("New Student", 2, 4.0, "Male", Arrays.asList("Swimming", "Basketball"));
	};
	
	// lambda supplier that can get multiple student records
	public static Supplier<List<Student>> studentRepoProvider = () -> StudentRepository.getStudents();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(studentProvider.get());
		System.out.println(studentRepoProvider.get());
		
	}

}
