package com.cts.training.lambdas;


class GreetingBase{
	
	// 1. add more methods to convey message over email, sms...
	
	// 2. need to improvise this method to convey message across multiple platform..
	/*public void conveyGreetings(String message) {
		// convey message on console
		System.out.println(message);
	}*/

	// Solution : inject an Greetings interface
	/*public void conveyGreetings(String message, Greetings greeting) {
		// depend on implementation of Greetings interface being injected
		greeting.sendGreeting(message);
	}*/
	
	public void conveyGreetings(String message, TestInterface test) {
		// depend on implementation of Greetings interface being injected
		// greeting.sendGreeting(message);
		test.fun(message);
	}
}


@FunctionalInterface
interface TestInterface{
	void fun(String str);
}

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GreetingBase app = new GreetingBase();
		
		
		
		// Classical OOPs *****************************
		
		//app.conveyGreetings("Hello All");
		
		/*EmailGreetings email = new EmailGreetings();
		app.conveyGreetings("Hello All", email); // injecting the functionality (OOPs manner)
		
		app.conveyGreetings("Hello All", new SMSGreetings());
		
		app.conveyGreetings("Hello All", new Greetings() {
			
			@Override
			public void sendGreeting(String message) {
				// TODO Auto-generated method stub
				System.out.println("Message conveyed over  Twitter : " + message);
			}
		});*/
		
		
		// Classical OOPs *****************************
		
		// Requirement : injecting the functionality, shall not be required to create encapsulation
		
		// Need Independent function definition
		// variable that can hold function definition (not the return value)
		// Assume to have a new type : function : it would not have been backward compatible 
		
		/*
		<Function type> <variable> = <functionality>;
		
		app.conveyGreetings("Hello All", <variable>);
		*/
		
		// Improvisation on interfaces to support the <function type>
		// <interface> <reference> = <function definition> // not encapsulated under any class : defined as lambda expression syntax
		/*Greetings network = void someFun(String message) {
			System.out.println("Messages conveyed over network : " + message);
		}*/
		
		// no type specification
		// no function name
		// add -> sign to differentiate method param with method body
		
		/*Greetings network = (message) -> {
			System.out.println("Messages conveyed over network : " + message);
		};*/
		
		 // Greetings network = message -> System.out.println("Messages conveyed over network : " + message);
	     // app.conveyGreetings("Hello All", network); // injecting pure functionality ( first class elements )
		
		// injecting pure functionality ( first class elements )
		// no type boundation....
		app.conveyGreetings("Hello All", message -> System.out.println("Messages conveyed over network : " + message)); 
		
	}

}
