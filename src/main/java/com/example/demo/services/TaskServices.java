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

    public void addTask(){
        Task t = new Task("Subida de prueba", false, LocalDate.of(2022, 11, 1));
        this.repository.save(t);
    }
}