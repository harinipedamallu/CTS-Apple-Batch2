package com.cts.training.modelanddata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentRepository {
	
	public static List<Student> getStudents(){
		List<Student> students = new ArrayList<Student>();
		
		Student student = new Student("First", 2, 3.6, "Male", Arrays.asList("Swimming", "BasketBall", "Soccor"));
		students.add(student);
		
		student = new Student("Second", 2, 3.8, "Female", Arrays.asList("Swimming", "BasketBall", "Soccor"));
		students.add(student);
		
		student = new Student("Third", 3, 4.0, "Male", Arrays.asList("Swimming", "BasketBall", "Soccor"));
		students.add(student);
		
		student = new Student("Fourth", 3, 4.0, "Female", Arrays.asList("Swimming", "BasketBall", "Soccor"));
		students.add(student);
		
		student = new Student("Fifth", 4, 3.5, "Male", Arrays.asList("Swimming", "BasketBall", "Soccor"));
		students.add(student);
		
		student = new Student("Sixth", 4, 3.9, "Female", Arrays.asList("Swimming", "BasketBall", "Soccor"));
		students.add(student);
		
		return students;
		
	}

}
