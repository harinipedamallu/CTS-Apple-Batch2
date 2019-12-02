package com.cts.training.reactiveapp.routers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.cts.training.reactiveapp.handlers.RestApiHandler;


import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class RestApiRouter {
	
	// it will be injected with instance of Handler class
	@Bean
	public RouterFunction<ServerResponse> routes(RestApiHandler restApiHandler) {
		
		// returns single/multiple router function  : contains the mapping of URL and handler method
		// RouterFunctions.route(<URL specific>,<Handler method ref>)
		
		return RouterFunctions
				.route(GET("/functional/flux").and(accept(MediaType.APPLICATION_JSON)), restApiHandler :: flux)
				.andRoute(GET("/functional/mono").and(accept(MediaType.APPLICATION_JSON)), restApiHandler :: mono);
	}

}
