package com.informaticonfig.spring.app1.springboot_applications.controllers;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.informaticonfig.spring.app1.springboot_applications.models.dto.ClaseDTO;

import org.springframework.web.bind.annotation.RequestMapping;


/*
 * O MVC (Model-View-Controller) é um padrão que separa responsabilidades:

 * Model → dados e regras de negócio.

 * View → interface com o usuário.

 * Controller → recebe requisições, processa e retorna a resposta.
 */


@RestController // Define uma API REST que retorna JSON/XML. | é uma anotação do Spring que indica que a classe é um controlador REST.
@RequestMapping("/api") // é uma anotação do Spring usada para mapear URLs para métodos em um controller.

public class EjemploRestController {


    //@RequestMapping(path = "/detalles_info2", method = RequestMethod.GET)
    @GetMapping(path = "/detalles_info2")
    
    public ClaseDTO detalles_info2(){ // -- 11 MUDEI nome class
// AULA 11 - MUDEI ABAIXO - COMENTARIO 1 AULA PASSADA - 
        // Empleados empleado1 = new Empleados("Juan","Rodrigues","Calle 1 No 2","gerente",
        // 35,332131232,001);
        // // Map é uma interface em Java que representa uma estrutura de dados para armazenar pares chave-valor.
        // Map<String, Object> respuesta = new HashMap<>(); // new HashMap - Cria um "dicionário" (respuesta) usando HashMap.
        // respuesta.put("Empleado", "Datos empleados");
        // respuesta.put("Informacion", empleado1);
        // return respuesta;


// aula 11
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Informaticonfig");

        return usuario1;
    }


}
