package com.cts.training.reactiveapp.fiuxandmonotests;

import java.time.Duration;

import org.junit.Test;

import reactor.core.publisher.ConnectableFlux;
import reactor.core.publisher.Flux;

public class ColdAndHotPublisherTest {

	/*@Test
	public void coldPublisher() throws InterruptedException{
		Flux<String> stringFlux = Flux.just("A", "B", "C", "D", "E", "F")
				.delayElements(Duration.ofSeconds(1)).log();
		
		stringFlux.subscribe(element -> System.out.println("Subscriber 1 :" + element));// emits value from beginning
		
		Thread.sleep(3000);
		
		stringFlux.subscribe(element -> System.out.println("Subscriber 2 :" + element)); // emits value from beginning
		
		Thread.sleep(4000);
	}*/
	
	/*@Test
	public void hotPublisher() throws InterruptedException{
		Flux<String> stringFlux = Flux.just("A", "B", "C", "D", "E", "F")
				.delayElements(Duration.ofSeconds(1)).log();
		
		
		// special Flux implementation for hot publishing
		ConnectableFlux<String> connectableFlux = stringFlux.publish();
		
		connectableFlux.connect();// activating 
		
		connectableFlux.subscribe(element -> System.out.println("Subscriber 1 :" + element));// emits value from beginning
		
		Thread.sleep(3000);
		
		connectableFlux.subscribe(element -> System.out.println("Subscriber 2 :" + element)); // emits value from beginning
		
		Thread.sleep(4000);
	}*/
	
	
}
