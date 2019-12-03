package com.cts.training.reactiveapp.handlers;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.cts.training.reactiveapp.constants.ItemConstants;
import com.cts.training.reactiveapp.documents.Item;
import com.cts.training.reactiveapp.repository.ItemReactiveRepository;

import reactor.core.publisher.Flux;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureWebTestClient
public class ItemHandlerTest {

	@Autowired
	WebTestClient webTestClient;
	
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

	}
	
	@Test
	public void getAllItemTestApproach1() {
		this.webTestClient.get().uri(ItemConstants.ITEM_FUNCTIONAL_END_POINT)
						.exchange()
						.expectStatus().isOk()
						.expectBodyList(Item.class)
						.hasSize(4);
	}
	
	@Test
	public void getAllItemTestApproach2() {
		this.webTestClient.get().uri(ItemConstants.ITEM_FUNCTIONAL_END_POINT)
						.exchange()
						.expectStatus().isOk()
						.expectBodyList(Item.class)
						.hasSize(4)
						.consumeWith(response -> {
							List<Item> items = response.getResponseBody();
							items.forEach(item -> {
								assertTrue(item.getId() !=null);
							});
						});
	}
	
	@Test
	public void getItemByIdTest() {
		this.webTestClient.get().uri(ItemConstants.ITEM_FUNCTIONAL_END_POINT + "/ABC")
				.exchange()
				.expectStatus().isOk()
				.expectBody() // allow to access individual field
				.jsonPath("$.price",  190.0);
	}*/
	
	
}
