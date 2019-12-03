package com.cts.training.reactiveapp.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.cts.training.reactiveapp.documents.Item;
import com.cts.training.reactiveapp.repository.ItemReactiveRepository;

import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.*;

@Component
public class ItemsHandler {

	// dependency
	@Autowired
	private ItemReactiveRepository itemReactiveRepository;
	
	public Mono<ServerResponse> getAllItems(ServerRequest serverRequest){
		
		return ServerResponse.ok()
			.contentType(MediaType.APPLICATION_JSON)
			.body(this.itemReactiveRepository.findAll(), Item.class); // reactive stream is body inserter (not type safe)
	}
	
	public Mono<ServerResponse> getItemById(ServerRequest serverRequest){  // Mono<ServerResponse[Item]>
		
	 	String itemId =  serverRequest.pathVariable("itemId");
	 	Mono<Item> itemMono = this.itemReactiveRepository.findById(itemId);
	 	
	 	return itemMono
		 	.flatMap(item->
		 			ServerResponse.ok()
		 				.contentType(MediaType.APPLICATION_JSON)
		 				.body(fromObject(item))) // if not a reactive stream, need to make use of bodyInserter (type safe)
		 	.switchIfEmpty(ServerResponse.notFound().build());
	}
	
	public Mono<ServerResponse> saveItem(ServerRequest serverRequest){
		
		Mono<Item> newItem =  serverRequest.bodyToMono(Item.class);
		
		return newItem
			 	.flatMap(item->
			 			ServerResponse.ok()
			 				.contentType(MediaType.APPLICATION_JSON)
			 				.body(this.itemReactiveRepository.save(item), Item.class));
	}
	
	// special handler for exception case
	public Mono<ServerResponse> exceptionHandler(ServerRequest serverRequest){
		throw new RuntimeException("Runtime Exception Occured!!!");
	}
	
	
	
}
