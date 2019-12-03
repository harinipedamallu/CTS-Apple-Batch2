package com.cts.training.reactiveapp.routers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.cts.training.reactiveapp.constants.ItemConstants;
import com.cts.training.reactiveapp.handlers.ItemsHandler;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class ItemsRouter {

	@Bean
	public RouterFunction<ServerResponse> itemsRoutes(ItemsHandler itemsHandler){
		return RouterFunctions
				.route(GET(ItemConstants.ITEM_FUNCTIONAL_END_POINT).and(accept(MediaType.APPLICATION_JSON)), itemsHandler :: getAllItems)
				.andRoute(GET(ItemConstants.ITEM_FUNCTIONAL_END_POINT + "/{itemId}").and(accept(MediaType.APPLICATION_JSON)), itemsHandler :: getItemById)
				.andRoute(POST(ItemConstants.ITEM_FUNCTIONAL_END_POINT).and(accept(MediaType.APPLICATION_JSON)), itemsHandler :: saveItem);
	}
	
	@Bean
	public RouterFunction<ServerResponse> exceptionRoutes(ItemsHandler itemsHandler){
		return RouterFunctions
				.route(GET(ItemConstants.ITEM_FUNCTIONAL_END_POINT + "/extra/exception").and(accept(MediaType.APPLICATION_JSON)), itemsHandler :: exceptionHandler);
				
	}
}
