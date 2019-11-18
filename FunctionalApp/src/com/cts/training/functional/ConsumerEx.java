package com.cts.training.functional;

import java.util.function.Consumer;

public class ConsumerEx {
	
	public static void main(String args[]) {
		// define a consumer that can consume(accept) a string and display it in upper
		Consumer<String> toUpper = str -> System.out.println(str.toUpperCase());
		
		toUpper.accept("Hello");
		
	}
}
