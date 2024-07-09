package com.ejemploreactiva.alejandro.rest1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemploreactiva.alejandro.rest1.service.HolaService;

@RestController
public class ControladorHola {

    @Autowired
    HolaService servicio;

    @RequestMapping("/hola")
    public String hola() {

        System.out.println("Endpoint /hola llamado");
        return servicio.hola();
    }

    @RequestMapping("/hola2")
    public String hola2() {

        System.out.println("Endpoint /hola2 llamado");
        return servicio.hola2();
    }

    @RequestMapping("/holas")
    public String holas() {

        long t1 = System.currentTimeMillis();
        String texto = servicio.hola() + servicio.hola2();
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
        int tTotal = (int) (t2 - t1);
        return texto + String.valueOf(tTotal);
    }
}