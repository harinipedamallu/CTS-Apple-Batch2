package com.cts.training.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.cts.training.modelanddata.Student;
import com.cts.training.modelanddata.StudentRepository;

public class StreamFlatMapEx {

	// method to extract activities and flatten them recieve as List<String>
	public static List<String> getActivitiesOfAllStudents(){
		return StudentRepository.getStudents()
			.stream() // Stream<Student>
			.map(Student :: getActivities) // Stream<List<String>>
			// want to pass a List and get back a stream of that list
			.flatMap(List :: stream) // Stream<String>
			.collect(Collectors.toList());
	}
	
	// method to extract unique activities that school provides
	public static List<String> getUniqueActivitiesOfSchool(){
		return StudentRepository.getStudents()
			.stream() // Stream<Student>
			.map(Student :: getActivities) // Stream<List<String>>
			// want to pass a List and get back a stream of that list
			.flatMap(List :: stream) // Stream<String>
			.distinct()
			.collect(Collectors.toList());
	}
	
	
	// method to extract unique activities that school provides
	public static long getCountOfUniqueActivitiesOfSchool(){
		return StudentRepository.getStudents()
			.stream() // Stream<Student>
			.map(Student :: getActivities) // Stream<List<String>>
			// want to pass a List and get back a stream of that list
			.flatMap(List :: stream) // Stream<String>
			.distinct()
			.count();
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getActivitiesOfAllStudents());
		System.out.println(getUniqueActivitiesOfSchool());
		System.out.println("Total Activities : " + getCountOfUniqueActivitiesOfSchool());
	}

}
