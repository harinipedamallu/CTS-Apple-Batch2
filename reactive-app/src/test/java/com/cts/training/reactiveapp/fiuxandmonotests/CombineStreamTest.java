package com.cts.training.reactiveapp.fiuxandmonotests;

import java.time.Duration;

import org.junit.Test;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class CombineStreamTest {

	/*@Test
	public void combineUsingMerge() {
		Flux<String> flux1 = Flux.just("A", "B", "C");
		Flux<String> flux2 = Flux.just("D", "E", "F");
		
		Flux<String> mergedFlux = Flux.merge(flux1, flux2);
		
		StepVerifier.create(mergedFlux.log())
					.expectSubscription()
					.expectNext("A", "B", "C", "D", "E", "F")
					.verifyComplete();
		
	}*/
	
	/*@Test
	public void combineUsingMergeWithDelay() {
		// lets consider flux are taking some extra time
		Flux<String> flux1 = Flux.just("A", "B", "C").delayElements(Duration.ofSeconds(1));
		Flux<String> flux2 = Flux.just("D", "E", "F").delayElements(Duration.ofSeconds(1));
		
		Flux<String> mergedFlux = Flux.merge(flux1, flux2); // merging will take place as and when data is received
		
		StepVerifier.create(mergedFlux.log())
					.expectSubscription()
					// .expectNext("A", "B", "C", "D", "E", "F")
					.expectNextCount(6)
					.verifyComplete();
		
	}*/
	
	/*@Test
	public void combineUsingConcat() {
		Flux<String> flux1 = Flux.just("A", "B", "C");
		Flux<String> flux2 = Flux.just("D", "E", "F");
		
		Flux<String> mergedFlux = Flux.concat(flux1, flux2);
		
		StepVerifier.create(mergedFlux.log())
					.expectSubscription()
					.expectNext("A", "B", "C", "D", "E", "F")
					.verifyComplete();
		
	}*/
	
	/*@Test
	public void combineUsingConcatWithDelay() {
		// lets consider flux are taking some extra time
		Flux<String> flux1 = Flux.just("A", "B", "C").delayElements(Duration.ofSeconds(1));
		Flux<String> flux2 = Flux.just("D", "E", "F").delayElements(Duration.ofSeconds(1));
		
		Flux<String> mergedFlux = Flux.concat(flux1, flux2); // merging will take place one after another
		
		StepVerifier.create(mergedFlux.log())
					.expectSubscription()
					.expectNext("A", "B", "C", "D", "E", "F")
					//.expectNextCount(6)
					.verifyComplete();
		
	}*/
	
	
	/*@Test
	public void combineUsingZip() {
		Flux<String> flux1 = Flux.just("A", "B", "C", "X");
		Flux<String> flux2 = Flux.just("D", "E", "F");
		
		Flux<String> mergedFlux = Flux.zip(flux1, flux2, (data1, data2)-> data1.concat(data2)); // AD, BE, CF
		
		StepVerifier.create(mergedFlux.log())
					.expectSubscription()
					.expectNext("AD", "BE", "CF")
					.verifyComplete();
		
	}*/
}













