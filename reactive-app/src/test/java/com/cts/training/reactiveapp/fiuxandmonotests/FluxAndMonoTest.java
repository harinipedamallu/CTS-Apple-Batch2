package com.cts.training.reactiveapp.fiuxandmonotests;

import org.junit.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class FluxAndMonoTest {

	/*@Test
	public void fluxCode() {
		Flux<String> stringFlux = Flux.just("Spring", "Spring Boot", "Reactive Spring")
				  .concatWith(Flux.error(new RuntimeException("Exception in Flux!!!")))	
				  .concatWith(Flux.just("More Data"))
				.log();
		
		// without call of subscribe no streaming will take place :
		stringFlux
			.subscribe(System.out::println,  // Consumer for onNext()
					 exception -> System.err.println("Exception is : " + exception), // Consumer for onError()
					 () -> System.out.println("Completed")); // for onComplete()
		
	}*/
	
	/*@Test
	public void fluxTest() {
		Flux<String> stringFlux = Flux.just("Spring", "Spring Boot", "Reactive Spring")
									.log();
		
		StepVerifier.create(stringFlux)
					// assert the step
					.expectNext("Spring") // test for only one onNext() call
					.expectNext("Spring Boot")
					.expectNext("Reactive Spring")
					// terminal test
					.verifyComplete();
		
	}*/
	
	/*@Test
	public void fluxTestWithError() {
	Flux<String> stringFlux = Flux.just("Spring", "Spring Boot", "Reactive Spring")
									.concatWith(Flux.error(new RuntimeException("Exception in Flux!!!")))
								.log();
	
	StepVerifier.create(stringFlux)
				// assert the step
				.expectNext("Spring", "Spring Boot", "Reactive Spring")
				/*.expectNext("Spring") // test for only one onNext() call
				.expectNext("Spring Boot")
				.expectNext("Reactive Spring")
				// .expectError(RuntimeException.class)
				.expectErrorMessage("Exception in Flux!!!")
				// terminal operation
				.verify(); // subscribe to publisher
		
	}*/
	
	/*@Test
	public void fluxTestWithCount() {
	Flux<String> stringFlux = Flux.just("Spring", "Spring Boot", "Reactive Spring")
									// .concatWith(Flux.error(new RuntimeException("Exception in Flux!!!")))
								.log();
	
	StepVerifier.create(stringFlux)
				.expectNextCount(3)
				.verifyComplete();
		
	}*/
	
	/*@Test
	public void monoTest() {
		Mono<String> stringMono =  Mono.just("Spring");
		
		StepVerifier.create(stringMono.log())
				.expectNext("Spring")
				.verifyComplete();
	}*/
}
	
