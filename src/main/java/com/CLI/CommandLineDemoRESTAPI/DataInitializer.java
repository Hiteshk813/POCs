package com.CLI.CommandLineDemoRESTAPI;

import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    public final TaskRepository taskRepository;


    public DataInitializer(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Task task1 = new Task(1L,"Task 1","Description for Task 1");
        task1.setTitle("Task 1");
        task1.setDescription("Description for Task 1");
        taskRepository.save(task1);

        Task task2 = new Task(2L,"Task 2","Description for Task 2");
        task2.setTitle("Task 2");
        task2.setDescription("Description for Task 2");
        taskRepository.save(task2);

    }
}
