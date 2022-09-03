package com.example.demo.services;

import com.example.demo.entities.Task;
import com.example.demo.repositories.TaskRepositorio;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TaskServices {

    private TaskRepositorio repository;

    public TaskServices(TaskRepositorio repository){
        this.repository = repository;
    }

    public List<Task> getTaskList(){
        return this.repository.findAll();
    }

    public Task createTask(Task task){
        return this.repository.save(task);
    }
}