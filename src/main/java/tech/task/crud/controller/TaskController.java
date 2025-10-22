package tech.task.crud.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import tech.task.crud.entity.Task;
import tech.task.crud.service.TaskService;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    @GetMapping
    public ResponseEntity<List<Task>>getTasks() {
        return ResponseEntity.ok(taskService.getAllTasks());
    }

    @GetMapping("{id}")
    public ResponseEntity<Task> getTask(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.getTaskById(id));
    }

    @PostMapping
    public ResponseEntity<Void> createTask(@Validated @RequestBody Task task) {
        taskService.saveTask(task);
        URI location = URI.create("/api/tasks");
        return ResponseEntity.created(location).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id) {
        return ResponseEntity.ok(taskService.updateTask(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.deleteTaskById(id);
        return ResponseEntity.noContent().build();
    }
}
