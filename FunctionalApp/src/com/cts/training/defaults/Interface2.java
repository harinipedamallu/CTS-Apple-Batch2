package com.cts.training.defaults;

public interface Interface2 extends Interface1{
	
	default void methodB() {
		System.out.println("Defult methodB from " + Interface2.class);
	}
	
	default void methodA() {
		System.out.println("Defult methodA from " + Interface2.class);
	}
}
