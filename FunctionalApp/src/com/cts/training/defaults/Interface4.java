package com.cts.training.defaults;

public interface Interface4 {
	
	default void methodA() {
		System.out.println("Defult methodA from " + Interface4.class);
	}

}
