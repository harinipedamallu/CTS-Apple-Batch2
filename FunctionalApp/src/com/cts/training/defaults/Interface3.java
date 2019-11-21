package com.cts.training.defaults;

public interface Interface3 extends Interface2{
	default void methodC() {
		System.out.println("Defult methodC from " + Interface3.class);
	}
}
