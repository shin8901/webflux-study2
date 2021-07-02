package com.webflux.webfluxstudy2;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class EchoHandler {  

    public Mono<ServerResponse> echo(ServerRequest req){

        //Repository, Service, Controller, org.springframework.context.annotation.ClassPathBeanDefinitionScanner
        //System.out.println("dddddddddddddddddddddddddddddd");
        return ServerResponse.ok().body(req.bodyToMono(String.class),String.class);
    }
}
