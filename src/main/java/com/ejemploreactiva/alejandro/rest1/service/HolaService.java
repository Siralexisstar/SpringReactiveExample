package com.ejemploreactiva.alejandro.rest1.service;

import org.springframework.stereotype.Service;

@Service
public class HolaService {

    /** Sleep with thread 3 seconds */
    public String hola() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hola Sincrono";
    }

    /** Sleep with thread 3 seconds */
    public String hola2() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hola Sincrono 2";
    }

}
