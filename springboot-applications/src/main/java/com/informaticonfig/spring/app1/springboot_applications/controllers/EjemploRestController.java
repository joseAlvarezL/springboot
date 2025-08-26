package com.informaticonfig.spring.app1.springboot_applications.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController // Define uma API REST que retorna JSON/XML.
public class EjemploRestController {


    @GetMapping("/detalles_info2")
    public Map<String, Object>detalles_info2(){
        // Map é uma interface em Java que representa uma estrutura de dados para armazenar pares chave-valor.
        Map<String, Object> respuesta = new HashMap<>(); // new HashMap - Cria um "dicionário" (respuesta) usando HashMap.
        respuesta.put("Titulo", "Servidor en linea");
        respuesta.put("Servidor","informaticonfig");
        respuesta.put("Ip", "192.321.1.1");

        return respuesta;
    }


}
