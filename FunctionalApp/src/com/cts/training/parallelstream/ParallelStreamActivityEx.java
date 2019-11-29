package com.cts.training.parallelstream;

import java.util.List;
import java.util.stream.Collectors;

import com.cts.training.modelanddata.Student;
import com.cts.training.modelanddata.StudentRepository;

public class ParallelStreamActivityEx {

	// collect transformed data from stream (List of activities of all students)
	public static List<String> seqListOfAcivities(){
		
		long start = System.currentTimeMillis();
		
		List<String> studentActivities =  StudentRepository.getStudents()
			.stream().peek(student -> System.out.println("Stream : " + student))
			.map(Student :: getActivities).peek(list -> System.out.println("Map : " + list)) // Stream<List<String>>
			.flatMap(List::stream).peek(activity -> System.out.println("FlatMap : " + activity)) // Stream<String>
			.collect(Collectors.toList());
		
		long end = System.currentTimeMillis();
		long diff = end - start;
		
		System.out.println("Sequential time : " + diff);
		
		return studentActivities;
	}
	
	public static List<String> parallelListOfAcivities(){
		
		long start = System.currentTimeMillis();
		
		List<String> studentActivities =  StudentRepository.getStudents()
			.parallelStream().peek(student -> System.out.println("Stream : " + student))
			.map(Student :: getActivities).peek(list -> System.out.println("Map : " + list)) // Stream<List<String>>
			.flatMap(List::stream).peek(activity -> System.out.println("FlatMap : " + activity)) // Stream<String>
			.collect(Collectors.toList());
		
		long end = System.currentTimeMillis();
		long diff = end - start;
		
		System.out.println("Parallel time : " + diff);
		
		return studentActivities;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sequential Result :" + seqListOfAcivities());
		System.out.println("Parallel Result :" + parallelListOfAcivities());

	}

}
