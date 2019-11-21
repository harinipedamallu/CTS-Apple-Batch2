package com.cts.training.defaults;

public interface Interface1 {

	default void methodA() {
		System.out.println("Defult methodA from " + Interface1.class);
	}
}
