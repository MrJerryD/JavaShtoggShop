package com.shtogg.shop.controllers;

import com.shtogg.shop.models.Item;
import com.shtogg.shop.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

    // create bean on ItemRepository models-repo
    @Autowired
    private ItemRepository itemRepository;


    // main page
    @GetMapping("/")
    public String index(Model model) {
//        model.addAttribute("name", "Shop Mall");
        Iterable<Item> items = itemRepository.findAll(); // получаем все записи с класса Item
        model.addAttribute("items", items);
        return "index";
    }

    // about-us page
    @GetMapping("/about-us")
    public String about(@RequestParam(name = "userName", required = false, defaultValue = "OWOW, the name wasn't found") String userName, Model model) {
        model.addAttribute("name", userName);
        return "about";
    }



}
