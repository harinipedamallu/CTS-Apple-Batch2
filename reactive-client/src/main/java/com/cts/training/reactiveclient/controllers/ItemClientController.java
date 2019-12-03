package com.cts.training.reactiveclient.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.cts.training.reactiveclient.domain.Item;

import reactor.core.publisher.Flux;

@RestController
public class ItemClientController {

	WebClient webClient = WebClient.create("http://localhost:9091");
	
	@GetMapping("/client/items")
	public Flux<Item> getAllItems(){
		
		/*return this.webClient.get().uri("/api/items")
				.exchange() // returns ClientResponse : required to fetch the data
				.flatMapMany(clientResponse -> clientResponse.bodyToFlux(Item.class));*/
		
		return this.webClient.get().uri("/api/items")
				.retrieve() // returns ResponseBody
				.bodyToFlux(Item.class);
				
	}
}
