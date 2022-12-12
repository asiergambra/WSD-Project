package com.example.stm.controller;

import com.example.stm.TaskRepository;
import com.example.stm.model.*;
import com.example.stm.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {

    private TaskService service;

    @Autowired
    public TaskController(TaskService service){
        this.service = service;
    }

    @PostMapping("/users/add")
    public void addTask(
            @RequestParam String title,
            @RequestParam String description,
            @RequestParam TaskType type
    ) {
        Task task = new Task(title,description,type);
        service.addTask(task);
    }

    @DeleteMapping("/users/delete/{taskId}")
    public void deleteTask(@PathVariable("taskId") int taskId){
        service.deleteTask(taskId);
    }

    @PutMapping("/users/updateStatus")
    public void updateStatus(
            @RequestParam TaskStatus status,
            @RequestParam int taskId
    ){
        service.updateStatus(status, taskId);
    }

    @GetMapping("/users/findById")
    public Task getTaskById(
            @RequestParam int taskId
    ){
        return service.getTaskById(taskId);
    }

    @GetMapping("/users")
    public List<Task> getTasks(){
        return service.getAllTask();
    }
}
