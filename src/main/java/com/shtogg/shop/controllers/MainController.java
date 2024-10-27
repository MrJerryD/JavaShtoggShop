package com.shtogg.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

    // main page
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "Shop Mall");
        return "index";
    }

    // about-us page
    @GetMapping("/about-us")
    public String about(@RequestParam(name = "userName", required = false, defaultValue = "OWOW, the name wasn't found") String userName, Model model) {
        model.addAttribute("name", userName);
        return "about";
    }



}