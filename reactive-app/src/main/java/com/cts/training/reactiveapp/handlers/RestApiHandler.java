package com.cts.training.reactiveapp.handlers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class RestApiHandler {

	// a method containing business logic to return a flux
	public  Mono<ServerResponse> flux(ServerRequest serverRequest) {
		
		// every data is wrapped in ServerResponse Object
		// need to make ServerResponse as Reactive Publisher (encapsulate as Mono)
		return ServerResponse.ok()
					.contentType(MediaType.APPLICATION_JSON)
					.body(Flux.just(1, 2, 3, 4).log(), Integer.class);
	}
	
	public  Mono<ServerResponse> mono(ServerRequest serverRequest) {
		
		// every data is wrapped in ServerResponse Object
		// need to make ServerResponse as Reactive Publisher (encapsulate as Mono)
		return ServerResponse.ok()
					.contentType(MediaType.APPLICATION_JSON)
					.body(Mono.just(1).log(), Integer.class);
	}
	
	
}
