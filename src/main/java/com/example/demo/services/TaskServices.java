package com.example.demo.services;

import com.example.demo.entities.Task;
import com.example.demo.entities.TaskList;

import java.time.LocalDate;
import java.util.ArrayList;

public class TaskServices {
    Task t1;
    Task t2;
    Task t3;
    Task t4;
    Task t5;

    TaskList metas;

    public TaskServices(){
        this.t1 = new Task("Recordar POO", true, LocalDate.of(2022, 8, 29));
        this.t2 = new Task("Conocer Intellij IDEA", false, LocalDate.of(2022, 8, 30));
        this.t3 = new Task("Conocer Java Spring Boot", true, LocalDate.of(2022, 8, 20));
        this.t4 = new Task("Afinar la arquitectura del proyecto", true, LocalDate.of(2022, 8, 20));
        this.t5 = new Task("Finalizar tareas", true, LocalDate.of(2022, 8, 20));

        this.metas = new TaskList("Ciclo 3");

        this.metas.addTaskList(t1);
        this.metas.addTaskList(t2);
        this.metas.addTaskList(t3);
        this.metas.addTaskList(t4);
        this.metas.addTaskList(t5);
    }

    public TaskList getTaskList(){
        return this.metas;
    }
}
