package com.cts.training.methodref;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.cts.training.functional.SupplierEx;
import com.cts.training.modelanddata.Student;

public class CombinationRefEx {

	static Predicate<Student> isfromUpperGrade = student -> student.getGrade() >= 3;
	
	static Predicate<Student> isfromUpperGradeMethodRef = CombinationRefEx :: greaterThan;
	
	static BiPredicate<Student, Integer> isfromRequiredGrade = CombinationRefEx :: greaterThan;
	
	
	static public boolean greaterThan(Student student) {
		return student.getGrade() >= 3;
	}
	
	static public boolean greaterThan(Student student, Integer grade) {
		return student.getGrade() >=  grade;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isfromUpperGrade.test(SupplierEx.studentProvider.get()));
		System.out.println(isfromUpperGradeMethodRef.test(SupplierEx.studentProvider.get()));
		System.out.println(isfromRequiredGrade.test(SupplierEx.studentProvider.get(), 2));
	}

}
