package com.webflux.webfluxstudy2;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class WebfluxStudy2ApplicationTests {

    @Autowired
    private WebTestClient webTestClient;
    @Test
    public void contextLoads() {
    }

    @Test
    public void servletCall(){
        this.webTestClient.get().uri("/test/11").accept(MediaType.TEXT_PLAIN).exchange().expectBody(String.class);
    }

    @Test
    public void fluxCall(){
        this.webTestClient.post().uri("/echo").contentType(MediaType.TEXT_PLAIN).body(Mono.just("hello flux!"),String.class)
                .exchange().expectBody(String.class).isEqualTo("hello flux!");
    }


}
