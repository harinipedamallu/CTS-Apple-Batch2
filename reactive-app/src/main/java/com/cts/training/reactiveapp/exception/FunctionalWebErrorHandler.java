package com.cts.training.reactiveapp.exception;

import java.util.Map;

import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.boot.autoconfigure.web.reactive.error.AbstractErrorWebExceptionHandler;
import org.springframework.boot.web.reactive.error.ErrorAttributes;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.*;

@Component
public class FunctionalWebErrorHandler extends AbstractErrorWebExceptionHandler{

	public FunctionalWebErrorHandler(ErrorAttributes errorAttributes, ApplicationContext applicationContext, ServerCodecConfigurer serverCodecConfigurer) {
		super(errorAttributes, new ResourceProperties(), applicationContext);
		
		// need to set message reader and writer to read/write over http
		super.setMessageWriters(serverCodecConfigurer.getWriters()); 
		super.setMessageReaders(serverCodecConfigurer.getReaders());
	}

	@Override
	protected RouterFunction<ServerResponse> getRoutingFunction(ErrorAttributes errorAttributes) {
		// TODO Auto-generated method stub
		
		// required to route to a handler method
		return RouterFunctions.route(RequestPredicates.all(), this :: renderExceptionResponse);
	}
	
	public Mono<ServerResponse> renderExceptionResponse(ServerRequest serverRequest){
		// all exception related info/attributes is available to us as Map
	 	Map<String, Object> errorAttributes = this.getErrorAttributes(serverRequest, false);
	 	
	 	return ServerResponse
	 		.status(HttpStatus.INTERNAL_SERVER_ERROR)
	 		.contentType(MediaType.APPLICATION_JSON)
	 		.body(fromObject(errorAttributes.get("message")));
	}
	
	

}
