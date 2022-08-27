package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
