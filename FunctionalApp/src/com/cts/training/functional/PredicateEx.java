package com.cts.training.functional;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateEx {

	// primitive Predicate
	static IntPredicate isEvenPro = value -> value % 2 == 0;
	
	static Predicate<Integer> isEven = value -> value % 2 == 0;
	
	static Predicate<Integer> isMultipleOf5 = value -> value % 5 == 0;
	
	
	public static void predicateAndCheck() {
		// System.out.println("AND result : " + isEven.and(isMultipleOf5).test(15));
		System.out.println("AND result : " + isEven.and(isMultipleOf5).test(10));
	}
	
	public static void predicateOrCheck() {
		// System.out.println("AND result : " + isEven.and(isMultipleOf5).test(15));
		System.out.println("OR result : " + isEven.or(isMultipleOf5).test(3));
	}
	
	public static void predicateNegateCheck() {
		// System.out.println("AND result : " + isEven.and(isMultipleOf5).test(15));
		System.out.println("NEGATE result : " + isEven.or(isMultipleOf5).negate().test(3));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Result : " + isEven.test(4));
		System.out.println("Result : " + isEven.test(5));
		
		System.out.println("Result : " + isEvenPro.test(10));
		
		
		predicateAndCheck();
		
		predicateOrCheck();
		
		predicateNegateCheck();
		
		
	}

}
