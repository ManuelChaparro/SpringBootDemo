package com.example.demo.controller;

import com.example.demo.entities.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class TaskController {

    @GetMapping("tasks")
    public Task taskList(){
        return new Task("Esta es una tarea para matematicas", false, LocalDate.of(2022, 8, 20));
    }
}