package com.cts.training.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.cts.training.modelanddata.Student;
import com.cts.training.modelanddata.StudentRepository;

public class StreamMapEx {

	// method to convert into upper case
	public static List<String> getUpperCaseNames(List<String> names){
		return names.stream()
			.map(String::toUpperCase)
			.collect(Collectors.toList());
	}
	
	// method to extract names and convert to upper case from Student records
	public static List<String> studentNamesToUpper(){
		return StudentRepository.getStudents()
				.stream() // Stream<Student>
				.map(Student::getName) // Stream<String>
				.map(String::toUpperCase) //Stream<String> : uppercase
				.collect(Collectors.toList()); // List<String>
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		names.add("First");
		names.add("Second");
		names.add("Third");
		names.add("Fourth");
		
		System.out.println("Upper Case Names : " + getUpperCaseNames(names));
		System.out.println("Upper Case Student Names : " + studentNamesToUpper());
		
		
	}

}
