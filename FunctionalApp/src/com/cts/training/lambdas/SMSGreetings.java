package com.cts.training.lambdas;

public class SMSGreetings  implements Greetings{

	@Override
	public void sendGreeting(String message) {
		// TODO Auto-generated method stub
		System.out.println("Message conveyed on SMS : " + message);
	}

}

