package com.cts.training.lambdas;

public class EmailGreetings implements Greetings{

	@Override
	public void sendGreeting(String message) {
		// TODO Auto-generated method stub
		System.out.println("Message conveyed on email : " + message);
	}

}
