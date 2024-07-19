package org.example.exo1_spring.service;

import lombok.Getter;
import lombok.Setter;
import org.example.exo1_spring.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
@Setter
public class TodoService {

    public List<Todo> todos() {
        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo(1,"todo1","Cours particulier",true));
        todos.add(new Todo(2,"todo2","Cours particulier plus",false));
        todos.add(new Todo(3,"todo3","Version particuliere",true));
        todos.add(new Todo(4,"todo4"," Danse Classique",true));
        return todos;
    }

}
