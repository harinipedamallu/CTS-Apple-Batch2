package com.cts.training.defaults;

public class Derived123 implements Interface1, Interface2, Interface3{

	@Override
	public void methodA() {
		System.out.println("Defult methodA from " + Derived123.class);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived123 derived = new Derived123();
		// multiple inheritance of functionality
		derived.methodA();
		derived.methodB();
		derived.methodC();

	}

}
