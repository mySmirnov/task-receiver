package com.itssamara.asmirnov.taskreceiver.facade;

import com.itssamara.asmirnov.taskreceiver.entity.Task;
import com.itssamara.asmirnov.taskreceiver.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class TaskFacade {
    private final TaskService taskService;

    public UUID save(String data, String type) {
        Task task = Task.builder()
                .type(type)
                .content(data.getBytes())
                .timestamp(LocalDate.now())
                .build();
        return taskService.save(task);
    }
}
