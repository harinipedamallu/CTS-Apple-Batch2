package com.cts.training.optional;

import java.util.Optional;

public class OptionalConfirmEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Optional<String> name = Optional.ofNullable("First");
		Optional<String> name = Optional.ofNullable(null);
		
		/*if(name.isPresent())
			System.out.println("Hello " + name.get());
		*/
		name.ifPresent(_name -> System.out.println("Hello " + _name));
		
	}

}
