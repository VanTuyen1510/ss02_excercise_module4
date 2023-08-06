package com.example.displaySandwich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sandwich") // Đường dẫn controller
public class SandwichController {

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestParam( "condiments") String[] condiments, Model model) {
        model.addAttribute("selected",condiments);
        for (String e : condiments) {
            System.out.println(e);
        }
        return "sandWich/list"; // đường dẫn package
    }
    @GetMapping("")
    public String show(){
        return "sandWich/list";
    }


}
