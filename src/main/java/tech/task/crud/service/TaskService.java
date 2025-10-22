package tech.task.crud.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.task.crud.entity.Task;
import tech.task.crud.repository.TaskRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id){
        return taskRepository.findById(id).orElse(null);
    }

    public void saveTask(Task task){
        taskRepository.save(task);
    }

    public Task updateTask(Long id){
        Task task = getTaskById(id);
        return taskRepository.save(task);
    }

    public void deleteTaskById(Long id){
        taskRepository.deleteById(id);
    }
}
