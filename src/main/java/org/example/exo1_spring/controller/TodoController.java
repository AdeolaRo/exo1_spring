package org.example.exo1_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {

    @RequestMapping("/todo2")
    public String todo(Model model){
        model.addAttribute("name", "todo1");
        model.addAttribute("description", "correction du code");
        model.addAttribute("etat",true);
        return "todo2";
    }
}
