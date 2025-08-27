package com.informaticonfig.spring.app1.springboot_applications.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.informaticonfig.spring.app1.springboot_applications.models.Empleados;

/*
 * O MVC (Model-View-Controller) é um padrão que separa responsabilidades:

 * Model → dados e regras de negócio.

 * View → interface com o usuário.

 * Controller → recebe requisições, processa e retorna a resposta.
 */

@Controller
public class EjemploController {// MVC - CONTROLADOR/CONTROLLER

/*AULA 9 - MUDEI A LINHA DE BAIXO E O HTML | EMPLEADOS.JAVA CRIEI | EJEMPLORESTCONTROLLER.JAVA 2 TAMBEM MUDEI */
/* USAR HTML E JSON */
@GetMapping("/detalles_info")
    public String info(Model model){ // MVC - MODELO/MODEL
        Empleados empleado1 = new Empleados("Juan","Rodrigues","Calle 1 No 2","gerente",
        35,332131232,001);

        model.addAttribute("Empleado",empleado1);

        return "detalles_info"; // MVC - VISTA/VIEW
    }


}
