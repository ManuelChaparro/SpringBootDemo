package com.example.demo.repositories;

import com.example.demo.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepositorio extends JpaRepository<Task, Long> {}
