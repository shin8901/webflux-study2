package com.webflux.webfluxstudy2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@SpringBootApplication
public class WebfluxStudy2Application {

    public static void main(String[] args) {
        SpringApplication.run(WebfluxStudy2Application.class, args);
    }


    @Bean
    public RouterFunction<ServerResponse> monoRouterFunc(EchoHandler handler){
        return route(POST("/echo"),handler::echo);
    }

}
