package com.informaticonfig.spring.app1.springboot_applications.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * O MVC (Model-View-Controller) é um padrão que separa responsabilidades:

 * Model → dados e regras de negócio.

 * View → interface com o usuário.

 * Controller → recebe requisições, processa e retorna a resposta.
 */

@Controller
public class EjemploController {// MVC - CONTROLADOR/CONTROLLER


    @GetMapping("/detalles_info")
    public String info(Map<String, Object>modelo){ // MVC - MODELO/MODEL

        modelo.put("Titulo", "Servidor en linea");
        modelo.put("Servidor","informaticonfig");
        modelo.put("Ip", "192.321.1.1");

        return "detalles_info"; // MVC - VISTA/VIEW
    }


}
