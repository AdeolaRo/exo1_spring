package org.example.exo1_spring.controller;

import org.example.exo1_spring.model.Todo;
import org.example.exo1_spring.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TodoControllerSet {
    private final TodoService todoService;

    //@Autowired
    public TodoControllerSet(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/todo-set")
    public String todoSet(Model model) {
        model.addAttribute("todos", todoService.todos());
        return "todo";
    }


    @RequestMapping("/todo-one")
    public String oneTodo(Model model) {
        Todo todo = new Todo(4,"todo8","fatal",false);
        model.addAttribute("name", todo.getName());
        model.addAttribute("description", todo.getDescription());
        if (todo.isDone()){
            model.addAttribute("status","fini");
        }else {
            model.addAttribute("status","en cours");
        }

        model.addAttribute("todo", new Todo(2,"todo7","lime",true));

        return "todo1";
    }


    @RequestMapping("/todo")
    @ResponseBody
    public List<Todo> todos() {
        return todoService.todos();
    }

}

