package com.cts.training.reactiveapp.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.cts.training.reactiveapp.documents.Item;

public interface ItemReactiveRepository extends ReactiveMongoRepository<Item, String>{

}
