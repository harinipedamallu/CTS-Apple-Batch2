package com.cts.training.functional;

import java.util.function.Function;

public class FunctionEx {
	
	// static Function<[paramtype], [return type]>
	
	// implementation : accept a string and return upper case 
	static Function<String, String> upperCase = (str) -> str.toUpperCase();
	
	// implementation : accept a string and return that string concatenated with other string 
	static Function<String, String> addSomeString = (str) -> str.concat("dummy");
	
	// implementation : accept a string and return length of string 
	static Function<String, Integer> getLength = (str) -> str.length();
		
		
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(upperCase.apply("Hello"));
		
		// need to get upper case and join a string with it
		System.out.println(upperCase.andThen(addSomeString).apply("Hello"));
		
		System.out.println(addSomeString.andThen(upperCase).apply("Hello"));
		
		System.out.println(upperCase.compose(addSomeString).apply("Hello"));
		
		// 1. returns a lambda reference (Function reference)
		// 2. prototype : accepts and returns same type of value
		// 3. lambda activity : whatever it accepts, it returns back same value 
		Function<String, String> identity = Function.identity();
		
		System.out.println(identity.apply("Hello"));
	}

}
