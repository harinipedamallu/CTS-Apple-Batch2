package com.cts.training.reactiveapp.controllers;

import java.time.Duration;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class FluxAndMonoController {

	@GetMapping(value = "/flux") // , produces= MediaType.APPLICATION_STREAM_JSON_VALUE) // each value a seperate json
	public Flux<Integer> returnFlux(){
		return Flux.just(1, 2, 3, 4)
				// .delayElements(Duration.ofSeconds(1))	
				.log();
	}
	
	
	@GetMapping(value = "/flux-infinite" , produces= MediaType.APPLICATION_STREAM_JSON_VALUE) // each value a seperate json
	public Flux<Long> returnInfiniteFlux(){
		return Flux.interval(Duration.ofSeconds(1))
				// .delayElements(Duration.ofSeconds(1))	
				.log();
	}
	
	
	
	
	
	@GetMapping(value = "/mono") 
	public Mono<Integer> returnMono(){
		return Mono.just(5).log();
	}
}
