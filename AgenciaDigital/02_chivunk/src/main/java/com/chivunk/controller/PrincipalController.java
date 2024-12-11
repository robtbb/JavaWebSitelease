package com.chivunk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {

    @GetMapping("/admin")
    public String acessoPrincipal(){
        return "admin/home";
    }

}
