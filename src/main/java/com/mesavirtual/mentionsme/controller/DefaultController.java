package com.mesavirtual.mentionsme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DefaultController {

    @GetMapping("/")
    public String index(@RequestParam(name="name", required=false, defaultValue="Login") String name, Model model) {
        model.addAttribute("name", name);
        return "default/index";
    }

    @GetMapping("/home")
    public String dashboard(@RequestParam(name="name", required=false, defaultValue="Dashboard") String name, Model model) {
        model.addAttribute("name", name);
        return "default/home";
    }
}
