package com.cts.training.reactiveapp.bootstrap;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.cts.training.reactiveapp.documents.Item;
import com.cts.training.reactiveapp.repository.ItemReactiveRepository;

import reactor.core.publisher.Flux;

// Register this class as event handler
@Component
public class ItemBootstrap implements ApplicationListener<ContextRefreshedEvent>{

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
	
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		this.loadItemData();
		
	}
	
	private void loadItemData() {
		this.itemReactiveRepository.deleteAll()
		.thenMany(Flux.fromIterable(items))
		.flatMap(this.itemReactiveRepository :: save)
		.doOnNext(item -> System.out.println("Inserted item : " + item))
		.blockLast(); 
	}
	
	
	

}
