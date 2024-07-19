package org.example.exo1_spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Todo {
    private int id;
    private String name;
    private String description;
    private boolean isDone;

}
