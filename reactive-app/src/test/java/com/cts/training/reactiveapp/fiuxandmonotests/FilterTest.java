package com.cts.training.reactiveapp.fiuxandmonotests;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class FilterTest {

	List<String> names = Arrays.asList("First", "Second", "Third", "Fourth");
	
	/*@Test
	public void filterTest() {
		Flux<String> namesFlux = Flux.fromIterable(names)
								.filter(name -> name.startsWith("F"))
								.log();
		
		StepVerifier.create(namesFlux)
					// .expectNext("First", "Second", "Third", "Fourth")
					.expectNext("First", "Fourth")
					.verifyComplete();
	}*/
}
