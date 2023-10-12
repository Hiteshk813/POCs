package com.CLI.CommandLineDemoRESTAPI;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task,Long> {
}
