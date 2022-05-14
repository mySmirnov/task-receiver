package com.itssamara.asmirnov.taskreceiver.repository;

import com.itssamara.asmirnov.taskreceiver.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
