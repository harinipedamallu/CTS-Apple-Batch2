package com.cts.training.defaults;

public class Derived14 implements Interface1, Interface4{

	@Override
	public void methodA() {
		System.out.println("Defult methodA from " + Derived14.class);
	}
	public static void main(String args[]) {
		Derived14 derived = new Derived14();
		
		derived.methodA();
	}
	
}
