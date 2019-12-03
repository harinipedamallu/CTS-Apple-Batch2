package com.cts.training.reactiveapp.repository;

import java.util.Arrays;
import java.util.List;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.training.reactiveapp.documents.Item;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@RunWith(SpringRunner.class)
@DataMongoTest
public class ItemReactiveRepositoryTest {

	// dependency 
	@Autowired
	private ItemReactiveRepository itemReactiveRepository;
	
	// dummy data
	List<Item> items = Arrays.asList(
			new Item(null, "Samsung TV", 400.0),
			new Item(null, "Sony Tv", 600.0),
			new Item(null, "Apple Watch", 260.0),
			new Item("ABC", "JBL Headphones", 190.0)
			);
			
	
	
	/*@Before
	public void setUp() {
		this.itemReactiveRepository.deleteAll()
				.thenMany(Flux.fromIterable(items))
				.flatMap(this.itemReactiveRepository :: save)
				.doOnNext(item -> System.out.println("Inserted item : " + item))
				.blockLast(); 

	}*/
	
	
	/*@Test
	public void getAllItemsTest() {
		
		 StepVerifier.create(this.itemReactiveRepository.findAll().log())
		 			.expectSubscription()
		 			.expectNextCount(4)
		 			.verifyComplete();
	}*/
	
	/*@Test
	public void getItemByIdTest() {
		
		 StepVerifier.create(this.itemReactiveRepository.findById("ABC").log())
		 			.expectSubscription()
		 			.expectNextMatches(item -> item.getDescription().equals("JBL Headphones"))
		 			.verifyComplete();
	}*/
	
	/*@Test
	public void saveTest() {
		
		Item item = new Item(null, "Google Home Mini", 40.00);
		
		Mono<Item> newItem = this.itemReactiveRepository.save(item); // no insertion now
		
		 StepVerifier.create(newItem.log()) // insertion here
		 			.expectSubscription()
		 			.expectNextMatches(itm -> itm.getDescription().equals("Google Home Mini"))
		 			.verifyComplete();
	}*/
	
	
	
}
