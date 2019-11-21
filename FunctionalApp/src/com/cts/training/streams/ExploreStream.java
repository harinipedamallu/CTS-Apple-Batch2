package com.cts.training.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.cts.training.modelanddata.Student;
import com.cts.training.modelanddata.StudentRepository;

public class ExploreStream {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.9;
		Predicate<Student> gradePredicate = student -> student.getGrade() >=3;
		
		// would like to fetch Map containing name and activities of students 
		// filter records on gpa value
		Map<String, List<String>> studentMap =  StudentRepository.getStudents()
				.stream().peek(student-> System.out.println("Initiated :" + student))
				.filter(gradePredicate).peek(student-> System.out.println("Ist Filter :" + student))
				.filter(gpaPredicate).peek(student-> System.out.println("IInd Filter :" + student))
				.collect(Collectors.toMap(Student::getName, Student :: getActivities)); // if it is not written , Streaming will not begin
		
		System.out.println(studentMap);
		
		
		// No activity : No Terminal Activity
		StudentRepository.getStudents().stream().peek(student-> System.out.println("Initiated :" + student))
		.filter(gradePredicate).peek(student-> System.out.println("Ist Filter :" + student))
		.filter(gpaPredicate).peek(student-> System.out.println("IInd Filter :" + student));
		
		 
		
	}

}
