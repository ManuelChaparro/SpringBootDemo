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

    private TaskServices services;

    public TaskController(TaskServices services){
        this.services = services;
    }

    @GetMapping("/tasks")
    public List<Task> getTaskList(){
        return services.getTaskList();
    }

    @PostMapping("/tasks")
    public Task createTask(@RequestBody Task task){
        return this.services.createTask(task);
    }
}