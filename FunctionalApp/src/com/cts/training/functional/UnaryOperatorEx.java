package com.cts.training.functional;

import java.util.function.UnaryOperator;

public class UnaryOperatorEx {

	// lambda implementation accepting string and returning upper case
	static UnaryOperator<String> upperUnary = (str) -> str.toUpperCase();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(upperUnary.apply("Hello"));

	}

}
