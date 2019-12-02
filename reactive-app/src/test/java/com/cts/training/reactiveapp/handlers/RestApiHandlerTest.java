package com.cts.training.reactiveapp.handlers;

import static org.junit.Assert.assertEquals;

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
// @WebFluxTest  // able to scan @Controller/@RestController : but does not scan for @Component/@Bean/@Configuration
@AutoConfigureWebTestClient // Auto inject an instance of WebTestClient
@SpringBootTest
public class RestApiHandlerTest {

	@Autowired
	WebTestClient webTestClient;
	
	
	/*@Test
	public void testFluxApproach1() {
		
		// testing the availability of REST endpoint
		Flux<Integer> integerFlux =  webTestClient.get().uri("/functional/flux")
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
	}
	
	@Test
	public void testMono() {
		
		// expected data
		Integer expectedValue = new Integer(1);
		
		
		// testing the availability of REST endpoint
		webTestClient.get().uri("/functional/mono")
			.accept(MediaType.APPLICATION_JSON_UTF8)
			.exchange() // sents the request
			.expectStatus().isOk() // alt to HttpStatus Constants
			.expectBody(Integer.class)
			.consumeWith(response ->{
				assertEquals(expectedValue, response.getResponseBody());
			});
		 
		
	}*/
}
