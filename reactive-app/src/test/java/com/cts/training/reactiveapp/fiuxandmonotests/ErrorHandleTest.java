package com.cts.training.reactiveapp.fiuxandmonotests;

import org.junit.Test;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class ErrorHandleTest {

	@Test
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
				
	}
}
