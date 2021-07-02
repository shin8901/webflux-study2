package com.webflux.webfluxstudy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value="/test/{id}")
    void test(@PathVariable String id){
        System.out.println("ddddd");
        System.out.println(id);
        System.out.println(id);
    }
}
