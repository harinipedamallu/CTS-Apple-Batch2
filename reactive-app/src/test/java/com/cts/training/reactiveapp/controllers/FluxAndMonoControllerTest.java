package com.cts.training.reactiveapp.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@RunWith(SpringRunner.class)
@WebFluxTest  // able to scan @Controller/@RestController : but does not scan for @Component/@Bean
@AutoConfigureWebTestClient // Auto inject an instance of WebTestClient
// @SpringBootTest
public class FluxAndMonoControllerTest {
	
	@Autowired
	WebTestClient webTestClient;
	
	/*@Test
	public void testFluxApproach1() {
		
		// testing the availability of REST endpoint
		Flux<Integer> integerFlux =  webTestClient.get().uri("/flux")
			.accept(MediaType.APPLICATION_JSON_UTF8)
			.exchange() // sents the request
			.expectStatus().isOk() // alt to HttpStatus Constants
			.returnResult(Integer.class) // type of data expected
			.getResponseBody(); // get the content exposed by rest end-point
		 
		// testing the Flux data 
		StepVerifier.create(integerFlux)
			.expectSubscription()
			.expectNext(1, 2, 3, 4)
			.verifyComplete();
	}*/
	
	/*@Test
	public void testFluxApproach2() {
		
		// testing the availability of REST endpoint
		webTestClient.get().uri("/flux")
			.accept(MediaType.APPLICATION_JSON_UTF8)
			.exchange() // sents the request
			.expectStatus().isOk() // alt to HttpStatus Constants
			.expectBodyList(Integer.class)
			.hasSize(4);
		 
		
	}*/
	
	/*@Test
	public void testFluxApproach3() {
		
		// expected data
		List<Integer> expectedList = Arrays.asList(1, 2, 3, 4);
		
		
		// testing the availability of REST endpoint
		webTestClient.get().uri("/flux")
			.accept(MediaType.APPLICATION_JSON_UTF8)
			.exchange() // sents the request
			.expectStatus().isOk() // alt to HttpStatus Constants
			.expectBodyList(Integer.class)
			.consumeWith(response ->{
				assertEquals(expectedList, response.getResponseBody());
			});
		 
		
	}*/
	
	/*@Test
	public void testMono() {
		
		// expected data
		Integer expectedValue = new Integer(5);
		
		
		// testing the availability of REST endpoint
		webTestClient.get().uri("/mono")
			.accept(MediaType.APPLICATION_JSON_UTF8)
			.exchange() // sents the request
			.expectStatus().isOk() // alt to HttpStatus Constants
			.expectBody(Integer.class)
			.consumeWith(response ->{
				assertEquals(expectedValue, response.getResponseBody());
			});
		 
		
	}*/
	
	/*@Test
	public void fluxInfinite() {
		
		Flux<Long> infiniteFlux =  webTestClient.get().uri("/flux-infinite")
				.accept(MediaType.APPLICATION_STREAM_JSON)
				.exchange() // sents the request
				.expectStatus().isOk() // alt to HttpStatus Constants
				.returnResult(Long.class) // type of data expected
				.getResponseBody(); // get the content exposed by rest end-point
		
		
		StepVerifier.create(infiniteFlux)
				.expectNext(0L)
				.expectNext(1L)
				.expectNext(2L)
				.thenCancel()
				.verify();
		
	}*/

}
