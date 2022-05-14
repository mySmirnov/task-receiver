package com.itssamara.asmirnov.taskreceiver.controller;

import com.itssamara.asmirnov.taskreceiver.facade.TaskFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/tasks")
public class Controller {
    private final TaskFacade taskFacade;

    @PostMapping
    public UUID save(@RequestBody String data, String type) {
        return taskFacade.save(data, type);
    }
}
