package com.cts.training.lambdas;

import java.util.function.Consumer;

public class LambdaLocalRel {
		static int value = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] i=new int[] {0,3};
		
		
		Consumer<Integer> consumer = value -> {
			// System.out.println(value);
			// int i = 10; // can't redeclare
			 i[0] = 5; // effectively final
			// i= new int[] {20, 30};
			// System.out.println(i);
			System.out.println(value);
		};
		
		// i = 5;
		
		consumer.accept(10);
	}

}
