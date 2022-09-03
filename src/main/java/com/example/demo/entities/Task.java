package com.example.demo.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "task")
public class Task {

    @Id @GeneratedValue(strategy=GenerationType.AUTO) long id;
    @Column(name = "description")
    private String description;
    @Column(name = "done")
    private boolean done;
    @Column(name = "dueDate")
    private LocalDate dueDate;

    public Task() {}

    public Task(String description, boolean done, LocalDate dueDate) {
        this.description = description;
        this.done = done;
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", done=" + done +
                ", dueDate=" + dueDate +
                '}';
    }
}