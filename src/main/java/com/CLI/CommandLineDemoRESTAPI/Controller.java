package com.CLI.CommandLineDemoRESTAPI;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class Controller {
    private final TaskRepository taskRepository;

    public Controller(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @GetMapping
    public Iterable<Task> getTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/{id}")
    public Task getTask(@PathVariable Long id) {
        return taskRepository.findById(id).orElse(null);
    }
}