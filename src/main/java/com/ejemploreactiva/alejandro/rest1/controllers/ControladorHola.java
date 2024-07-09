package com.ejemploreactiva.alejandro.rest1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemploreactiva.alejandro.rest1.service.HolaService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ControladorHola {

    @Autowired
    HolaService servicio;

    @RequestMapping("/hola")
    public Mono<String> hola() {

        System.out.println("Endpoint /hola llamado");
        return servicio.hola();
    }

    @RequestMapping("/hola2")
    public Mono<String> hola2() {

        System.out.println("Endpoint /hola2 llamado");
        return servicio.hola2();
    }

    @RequestMapping("/holas")
    public Flux<String> holas() {
        
        Mono<String> mono1 = servicio.hola();
        Mono<String> mono2 = servicio.hola2();

        Flux<String> flujo = Flux.concat(mono1, mono2);
     
        return flujo;
    }
}