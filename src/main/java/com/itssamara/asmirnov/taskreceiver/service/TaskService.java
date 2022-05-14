package com.itssamara.asmirnov.taskreceiver.service;

import com.itssamara.asmirnov.taskreceiver.entity.Task;

import java.util.UUID;

public interface TaskService {
    UUID save(Task task);
}
