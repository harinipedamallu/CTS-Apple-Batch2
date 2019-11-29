package com.cts.training.reactiveapp.fiuxandmonotests;

import java.time.Duration;

import org.junit.Test;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class ErrorHandleTest {

	/*@Test
	public void fluxErrorHandling() {
		Flux<String> stringFlux = Flux.just("A", "B", "C", "D")
										.concatWith(Flux.error(new RuntimeException("Exception in Flux!!!")))
										.concatWith(Flux.just("More Data")) // does not execute
										// handler
										.onErrorResume(exception->{   // this part gets executed, it will stop propagation of onError() to subscriber
												System.out.println("Exception is : " + exception);
												return Flux.just("More Data1", "More Data2");
										});
										
		
		StepVerifier.create(stringFlux.log())
				.expectSubscription()
				.expectNext("A", "B", "C", "D")
				//.expectError(RuntimeException.class)
				//.verify();
				.expectNext("More Data1", "More Data2")
				.verifyComplete();
				
	}*/
	
	/*@Test
	public void fluxErrorHandlingOnErrorReturn() {
		Flux<String> stringFlux = Flux.just("A", "B", "C", "D")
										.concatWith(Flux.error(new RuntimeException("Exception in Flux!!!")))
										.concatWith(Flux.just("More Data")) // does not execute
										.onErrorReturn("After Error Data");  // handler : not resume, bit just returning a fallback (only on case of error)
										
		
		StepVerifier.create(stringFlux.log())
				.expectSubscription()
				.expectNext("A", "B", "C", "D")
				.expectNext("After Error Data")
				.verifyComplete();
				
	}*/
	
	
	
	
	/*@Test
	public void fluxErrorHandlingWithMap() {
		// Mapping error/exception from one type to another
		
		Flux<String> stringFlux = Flux.just("A", "B", "C", "D")
										.concatWith(Flux.error(new RuntimeException("Exception in Flux!!!")))
										.concatWith(Flux.just("More Data")) // does not execute
										.onErrorMap(exception -> new CustomException(exception)); // not handling the error, only mapping
										
		
		StepVerifier.create(stringFlux.log())
				.expectSubscription()
				.expectNext("A", "B", "C", "D")
				.expectError(CustomException.class)
				.verify();
				
	}*/
	
	/*@Test
	public void fluxErrorHandlingRetry() {
				
		Flux<String> stringFlux = Flux.just("A", "B", "C", "D")
										.concatWith(Flux.error(new RuntimeException("Exception in Flux!!!")))
										.concatWith(Flux.just("More Data")) // does not execute
										.onErrorMap(exception -> new CustomException(exception)) // not handling the error, only mapping
										.retry(2);
		
		StepVerifier.create(stringFlux.log())
				.expectSubscription()
				.expectNext("A", "B", "C", "D")
				.expectNext("A", "B", "C", "D")
				.expectNext("A", "B", "C", "D")
				.expectError(CustomException.class)
				.verify();
				
	}*/
	
	/*@Test
	public void fluxErrorHandlingRetryWithPause() {
				
		Flux<String> stringFlux = Flux.just("A", "B", "C", "D")
										.concatWith(Flux.error(new RuntimeException("Exception in Flux!!!")))
										.concatWith(Flux.just("More Data")) // does not execute
										.onErrorMap(exception -> new CustomException(exception)) // not handling the error, only mapping
										.retryBackoff(2, Duration.ofSeconds(5));
		
		StepVerifier.create(stringFlux.log())
				.expectSubscription()
				.expectNext("A", "B", "C", "D")
				.expectNext("A", "B", "C", "D")
				.expectNext("A", "B", "C", "D")
				// .expectError(CustomException.class)
				.expectError(IllegalStateException.class)
				.verify();
				
	}*/
	
	
	
	
}
