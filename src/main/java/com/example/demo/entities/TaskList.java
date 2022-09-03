package com.example.demo.entities;

import com.example.demo.entities.Task;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TaskList {

    private String name;
    private List<Task> taskList;

    public TaskList(String name) {
        this.name = name;
        this.taskList = new ArrayList<Task>();
    }

    public void removeTask(String description){
        taskList.removeIf(t->(t.getDescription().equals(description)));
    }

    public void addTaskList(Task task){
        taskList.add(task);
    }
}