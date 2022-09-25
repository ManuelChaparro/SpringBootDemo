package com.example.demo.services;

import com.example.demo.entities.Task;
import com.example.demo.repositories.TaskRepositorio;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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

    public Boolean markTaskAsFinished(long id){
        Optional<Task> task = this.repository.findById(id);
        if (task.isPresent()){
            task.get().setDone(true);
            this.repository.save(task.get());
            return true;
        }
        return false;
    }

    public Boolean deleteTask(long id){
        this.repository.deleteById(id);
        return true;
    }
}