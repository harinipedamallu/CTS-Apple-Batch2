package com.cts.training.functional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.cts.training.modelanddata.Student;
import com.cts.training.modelanddata.StudentRepository;

public class FunctionStudentEx {

	// need to have lambda implementation that can extract name and activities from students
	static Function<List<Student>, Map<String, List<String>>> nameAndActivityExtractor = students -> {
		Map<String, List<String>> nameActivityMap = new HashMap();
		
		// inject on-the-fly consumer
		students.forEach(student -> {
			// can add predicate filter
			nameActivityMap.put(student.getName(), student.getActivities());
		});
		
		return nameActivityMap;
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	System.out.println(nameAndActivityExtractor.apply(StudentRepository.getStudents()));
	}

}
