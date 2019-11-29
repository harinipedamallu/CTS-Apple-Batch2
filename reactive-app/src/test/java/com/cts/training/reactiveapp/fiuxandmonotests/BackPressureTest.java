package com.cts.training.reactiveapp.fiuxandmonotests;

import java.time.Duration;

import org.junit.Test;

import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class BackPressureTest {

	/*@Test
	public void backPressure() {
		
		// create a publisher infinite stream of data
		// Flux<Long> infiniteFlux =  Flux.interval(Duration.ofSeconds(1)).log(); // non-blocking code (Reactive behavior)
		
		// infiniteFlux.subscribe(element -> System.out.println(element));
		
		
		Flux<Integer> intFlux = Flux.range(1, 10).log();
		
		intFlux.subscribe(element -> System.out.println("Element is : " + element), // get called on onNext() message/event
						exception -> System.out.println("Exception is : " + exception),
						() -> System.out.println("Done!!!"),
						subscription -> subscription.cancel()); // customize the subscription call
						//subscription -> subscription.request(3)); // customize the subscription call
		
		
	}*/
	
	/*@Test
	public void customizedBackPressureTest() {
		
		
		Flux<Integer> intFlux = Flux.range(1, 10).log();
		
		// intFlux.subscribe(<implementation of BaseSubscriber>);
		intFlux.subscribe(new BaseSubscriber<Integer>() {
			protected void hookOnNext(Integer value){  // onNext()
				request(1);
				System.out.println("Value received : " + value);
				if(value == 4)
					cancel();
			}
		});
	}*/
	
	
	
	/*@Test
	public void backPressureTest() {
		
		
		Flux<Integer> intFlux = Flux.range(1, 10).log();
		
		StepVerifier.create(intFlux)
				.expectSubscription()
				.thenRequest(1)
				.expectNext(1)
				.thenRequest(1)
				.expectNext(2)
				.thenRequest(1)
				.expectNext(3)
				.thenCancel()
				.verify();
				
	}*/
}
