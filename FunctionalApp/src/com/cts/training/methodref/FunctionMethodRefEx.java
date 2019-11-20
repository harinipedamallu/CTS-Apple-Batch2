package com.cts.training.methodref;

import java.util.function.Function;

public class FunctionMethodRefEx {

	static Function<String, String> upperCase = (str) -> str.toUpperCase();
	
	static Function<String, String> upperCasePro = String :: toUpperCase;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Upper Case : " + upperCase.apply("Hello"));
		System.out.println("Upper Case Pro : " + upperCasePro.apply("Hello"));
		
	}

}
