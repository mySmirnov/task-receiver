package com.itssamara.asmirnov.taskreceiver.service.impl;

import com.itssamara.asmirnov.taskreceiver.entity.Task;
import com.itssamara.asmirnov.taskreceiver.repository.TaskRepository;
import com.itssamara.asmirnov.taskreceiver.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository repository;
    @Override
    public UUID save(Task task) {
         repository.save(task);
         return null;
    }
}
