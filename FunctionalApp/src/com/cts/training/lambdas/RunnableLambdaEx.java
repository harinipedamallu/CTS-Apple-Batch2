package com.cts.training.lambdas;

public class RunnableLambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Classical approach
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Inside Runnable Thread (Classic)");
			}
		};
		
		new Thread(runnable).start();
		
		// Lambda approach
		Runnable runnableA = () -> System.out.println("Inside Runnable Thread (Lambda A)");
		
		Runnable runnableB = () -> {
				System.out.println("Inside Runnable Thread (Lambda B)");
				System.out.println("Inside Runnable Thread (Lambda B)");
				};
		new Thread(runnableA).start();
		new Thread(runnableB).start();
		
		new Thread(()-> System.out.println("Inside Runnable Thread (Lambda Direct)")).start();
	}

}
