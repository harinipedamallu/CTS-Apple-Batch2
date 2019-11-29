package com.cts.training.reactiveapp.fiuxandmonotests;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class TransformTest {

	List<String> names = Arrays.asList("First", "Second", "Third", "Fourth");
	
	/*@Test
	public void transformUsingMap() {
		Flux<String> namesFlux = Flux.fromIterable(names)
				.map(name -> name.toUpperCase())
				.log();
		StepVerifier.create(namesFlux)
				.expectNext("FIRST", "SECOND", "THIRD", "FOURTH")
				.verifyComplete();
	}*/
	
	/*@Test
	public void transformUsingMapReturnsLength() {
		Flux<Integer> namesFlux = Flux.fromIterable(names)
				.map(name -> name.length())
				.repeat(1) // repeat the data
				.log();
		StepVerifier.create(namesFlux)
				.expectNext(5, 6, 5, 6, 5, 6, 5, 6)
				.verifyComplete();
	}*/
}
