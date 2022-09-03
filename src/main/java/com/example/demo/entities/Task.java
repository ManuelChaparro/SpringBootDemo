package com.example.demo.entities;

import javax.persistence.*;
import java.time.LocalDate;
import lombok.*;


@Data
@Entity
@Table(name = "task")
public class Task {

    @Id @GeneratedValue(strategy=GenerationType.AUTO) private long id;
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
}