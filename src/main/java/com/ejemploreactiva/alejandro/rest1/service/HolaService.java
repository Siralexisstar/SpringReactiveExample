package com.ejemploreactiva.alejandro.rest1.service;

import java.time.Duration;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

@Service
public class HolaService {

    /** Sleep with thread 3 seconds */
    public Mono<String> hola() {
        
        return Mono.just("Hola asincrono").delayElement(Duration.ofSeconds(3));
    }

    /** Sleep with thread 3 seconds */
    public Mono<String> hola2() {
        
        return Mono.just("Hola asincrono 2").delayElement(Duration.ofSeconds(3));
    }

}
