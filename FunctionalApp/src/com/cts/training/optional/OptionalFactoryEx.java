package com.cts.training.optional;

import java.util.Optional;

public class OptionalFactoryEx {

	public static Optional<String> ofNullableMethod(){
		// wraps any raw data as Optional Object
		// return Optional.ofNullable("Hello");
		return Optional.ofNullable(null);
	}
	
	public static Optional<String> ofMethod(){
		// wraps any raw data as Optional Object
		// return Optional.of("Hello");
		// does not accepts null
		return Optional.of(null);
	}
	
	public static Optional<String> emptyMethod(){
		// create any empty wrapper Object
		return Optional.empty();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System.out.println("of Nullable : " + ofNullableMethod().get());
		 System.out.println("of : " + ofMethod().get());
		// System.out.println("empty : " + emptyMethod().get());
		
	}

}
