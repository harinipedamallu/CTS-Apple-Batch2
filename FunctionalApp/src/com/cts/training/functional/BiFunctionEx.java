package com.cts.training.functional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

import com.cts.training.modelanddata.Student;
import com.cts.training.modelanddata.StudentRepository;

public class BiFunctionEx {
	
	// need to have lambda implementation that can extract name and activities from students based on condition
		static BiFunction<List<Student>, Predicate<Student>, Map<String, List<String>>> nameAndActivityFilterExtractor = (students, studentFilter) -> {
			Map<String, List<String>> nameActivityMap = new HashMap();
			
			// inject on-the-fly consumer
			students.forEach(student -> {
				// can add predicate filter
				if(studentFilter.test(student))
					nameActivityMap.put(student.getName(), student.getActivities());
			});
			
			return nameActivityMap;
		};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nameAndActivityFilterExtractor.apply(StudentRepository.getStudents(), PredicateStudentEx.filterOnGrade));
	}

}
