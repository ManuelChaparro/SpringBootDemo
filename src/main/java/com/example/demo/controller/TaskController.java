package com.example.demo.controller;

import com.example.demo.entities.Task;
import com.example.demo.entities.TaskList;
import com.example.demo.services.TaskServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class TaskController {

    private TaskServices services;

    public TaskController(TaskServices services){
        this.services = services;
    }

    @GetMapping("/tasks")
    public List<Task> TaskList(){
        return services.getTaskList();
    }

    @GetMapping("/add")
    public void addTask(){
        services.addTask();
    }

}