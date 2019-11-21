package com.cts.training.defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.cts.training.modelanddata.Student;
import com.cts.training.modelanddata.StudentRepository;

public class DefaultMethodProEx {
	// ask for a Function functional implementation , and the returned by that method will be used for comparision
	// static Comparator<Student> nameComparator = Comparator.comparing(<ask for the value for comparision>);
	
	// static Comparator<Student> nameComparator = Comparator.comparing(student -> student.getName());
	static Comparator<Student> nameComparator = Comparator.comparing(Student :: getName);
	static Comparator<Student> gpaComparator = Comparator.comparing(Student :: getGpa);
	static Comparator<Student> genderComparator = Comparator.comparing(Student :: getGender);
	static Comparator<Student> gradeComparator = Comparator.comparing(Student :: getGrade);
	
	static Consumer<Student> studentConsumer = System.out::println;		
	
	
	public static void sortByName() {
		List<Student> students = StudentRepository.getStudents();
		students.sort(nameComparator);
		System.out.println("Sorted on name....");
		students.forEach(studentConsumer);
	}
	
	public static void sortByGpa() {
		List<Student> students = StudentRepository.getStudents();
		students.sort(gpaComparator);
		System.out.println("Sorted on GPA....");
		students.forEach(studentConsumer);
	}
	
	public static void sortByGrade() {
		List<Student> students = StudentRepository.getStudents();
		students.sort(gradeComparator);
		System.out.println("Sorted on Grade....");
		students.forEach(studentConsumer);
	}
	
	public static void sortByMultiple() {
		List<Student> students = StudentRepository.getStudents();
		students.sort(gradeComparator.thenComparing(nameComparator));
		System.out.println("Sorted on Multiple Criteria....");
		students.forEach(studentConsumer);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*sortByName();
		sortByGpa();
		sortByGrade();*/
		sortByMultiple();
		
	}

}
