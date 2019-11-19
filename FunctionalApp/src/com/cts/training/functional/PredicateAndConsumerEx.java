package com.cts.training.functional;

import java.util.List;
import java.util.function.Consumer;

import com.cts.training.modelanddata.Student;
import com.cts.training.modelanddata.StudentRepository;

public class PredicateAndConsumerEx {

	// need to print name and activity of students filtered on gpa and grade
	// 1. BiConsumer : that display name and activity
	// 2. Predicate : 2 predicate for filteration
	
	static Consumer<Student> studentConsumer = student -> {
		if(PredicateStudentEx.filterOnGpa.and(PredicateStudentEx.filterOnGrade).test(student))
			BiConsumerEx.displayNameAndActivity.accept(student.getName(), student.getActivities());
	};
	
	
	public static void printNameAndActivityFiltered() {
		
		List<Student> students = StudentRepository.getStudents();
		students.forEach(studentConsumer);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNameAndActivityFiltered();
	}

}
