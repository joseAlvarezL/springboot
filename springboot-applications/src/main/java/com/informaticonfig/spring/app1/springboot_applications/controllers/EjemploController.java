package com.informaticonfig.spring.app1.springboot_applications.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class EjemploController {


    @GetMapping("/detalles_info")
    public String info(Model model){

        model.addAttribute("Titulo", "Servidor en linea");
        model.addAttribute("Servidor","informaticonfig");
        model.addAttribute("Ip", "192.321.1.1");

        return "detalles_info";
    }


}
