package com.example.demo.repository;

import com.example.demo.model.TaskAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskAssiRepository extends JpaRepository<TaskAssignment,Long> {
}
