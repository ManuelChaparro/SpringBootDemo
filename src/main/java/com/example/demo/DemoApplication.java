package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Task t1 = new Task("Ingenieria", false, LocalDate.of(2022, 1, 8));
		Task t2 = new Task("Matematicas", false, LocalDate.of(2022, 2, 10));
		Task t3 = new Task("Ingles", false, LocalDate.of(2022, 3, 8));
		Task t4 = new Task("Requisitos", false, LocalDate.of(2022, 1, 15));

		TaskList list = new TaskList("Tareas");

		list.addTaskList(t1);
		list.addTaskList(t2);
		list.addTaskList(t3);
		list.addTaskList(t4);

		List<Task> array = list.getTaskList();

		for (Task t: array) {
			System.out.println(t.toString());
		}

		list.removeTask("Ingles");

		for (Task t: array) {
			System.out.println(t.toString());
		}
	}

}