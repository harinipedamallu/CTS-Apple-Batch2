package com.cts.training.newinterface;

public interface INewFeatures {

	void fun(); // by default : abstract
	
	// extension
	default void addedTask() {
		
	}
	
	static void sfun() {
		
	}
}
