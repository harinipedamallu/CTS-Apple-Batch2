package com.cts.training.reactiveapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.reactiveapp.constants.ItemConstants;
import com.cts.training.reactiveapp.documents.Item;
import com.cts.training.reactiveapp.repository.ItemReactiveRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ItemController {

	// dependency
	@Autowired
	private ItemReactiveRepository itemReactiveRepository;
	
	@GetMapping(ItemConstants.ITEM_END_POINT)
	public Flux<Item> getAllItems(){
		return this.itemReactiveRepository.findAll();
	}
	
	/*@GetMapping(ItemConstants.ITEM_END_POINT + "/{itemId}")
	public Mono<Item> getItemById(@PathVariable String itemId){
		return this.itemReactiveRepository.findById(itemId);
	}*/
	
	// return back record wrapped up as ResponseEntity
	@GetMapping(ItemConstants.ITEM_END_POINT + "/{itemId}")
	public Mono<ResponseEntity<Item>> getItemById(@PathVariable String itemId){
		
		return this.itemReactiveRepository.findById(itemId)
			.map(item -> new ResponseEntity<>(item, HttpStatus.OK)) // Mono<ResponseEntity<Item>>
			.defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@PostMapping(ItemConstants.ITEM_END_POINT)
	public Mono<Item> saveItem(@RequestBody Item item){
		
		return this.itemReactiveRepository.save(item);
		
	}
	
	// method expected to return a flux of item
	@GetMapping(ItemConstants.ITEM_END_POINT + "/exception")
	public Flux<Item> getAllItemsWithException(){
		return this.itemReactiveRepository.findAll()
				.concatWith(Mono.error(new RuntimeException("Runtime Exception Occured!!!")));
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<String> handleRuntimeException(RuntimeException e){
		return ResponseEntity
			.status(HttpStatus.INTERNAL_SERVER_ERROR)
			.body(e.getMessage());
	}
	
	
	
}
