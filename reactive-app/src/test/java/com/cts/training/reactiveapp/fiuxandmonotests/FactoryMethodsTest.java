package com.cts.training.reactiveapp.fiuxandmonotests;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class FactoryMethodsTest {

	List<String> names = Arrays.asList("First", "Second", "Third", "Fourth");
	
	/*@Test
	public void fluxUsingIterable() {
		Flux<String> namesFlux =  Flux.fromIterable(names).log();
		
		StepVerifier.create(namesFlux)
				.expectNext("First", "Second", "Third", "Fourth")
				.verifyComplete();
		
	}*/
	
	/*@Test
	public void fluxUsingArray() {
		
		String[] names = new String[] {"First", "Second", "Third", "Fourth"};
		
		Flux<String> namesFlux =  Flux.fromArray(names).log();
		
		StepVerifier.create(namesFlux)
				.expectNext("First", "Second", "Third", "Fourth")
				.verifyComplete();
		
	}*/
	
	/*@Test
	public void fluxUsingArray() {
		
		Flux<String> namesFlux =  Flux.fromStream(names.stream()).log();
		
		StepVerifier.create(namesFlux)
				.expectNext("First", "Second", "Third", "Fourth")
				.verifyComplete();
		
	}*/
	
	/*@Test
	public void monoUsingJustOrEmpty() {
		
		// Mono<String> mono = Mono.justOrEmpty(null);
		Mono<String> mono = Mono.empty();
		
		StepVerifier.create(mono.log())
					.verifyComplete();
		
	}*/
	
	
	/*@Test
	public void monoUsingSupplier() {
		
		Mono<String> mono = Mono.fromSupplier(()-> "First");
		
		
		StepVerifier.create(mono.log())
					.expectNext("First")
					.verifyComplete();
		
	}*/
	
	
}































