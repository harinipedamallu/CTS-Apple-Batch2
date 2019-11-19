package com.cts.training.functional;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

public class PrimitiveConsumerEx {

	static IntConsumer intConsumer = value -> System.out.println(value * value);
	static DoubleConsumer doubleConsumer = value -> System.out.println(value + value);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intConsumer.accept(5);
		doubleConsumer.accept(3.5);

	}

}
