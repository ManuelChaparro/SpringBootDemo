package com.example.demo.controller;

import com.example.demo.entities.Task;
import com.example.demo.services.TaskServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TaskController {

    private final TaskServices SERVICES;

    public TaskController(TaskServices services){
        this.SERVICES = services;
    }

    @GetMapping("/tasks")
    public List<Task> getTaskList(){
        return SERVICES.getTaskList();
    }

    @PostMapping("/tasks")
    public Task createTask(@RequestBody Task task){
        return this.SERVICES.createTask(task);
    }
}