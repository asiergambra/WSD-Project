package com.example.stm.services;

import com.example.stm.TaskRepository;
import com.example.stm.model.Task;
import com.example.stm.model.TaskStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    public void addTask(Task task){
        TaskRepository.users.add(task);
    }

    public Task getTaskById(int taskId){
        for(Task task : TaskRepository.users){
            if(task.getTaskId() == taskId){
                return task;
            }
        }
        return null;
    }

    public void deleteTask(int taskId){
        Task task = getTaskById(taskId);
        TaskRepository.users.remove(task);
    }

    public void updateStatus(TaskStatus status, int taskId){
        if(getTaskById(taskId) != null) {
            Task task = getTaskById(taskId);
            task.setStatus(status);
        }
    }
    public List<Task> getAllTask(){
        return TaskRepository.users;
    }
}
