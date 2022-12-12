package com.example.stm.model;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@ToString
@Data
@NoArgsConstructor
public class Task {
    private static int countId;
    private @Getter @Setter int taskId;
    private @Getter @Setter String title;
    private @Getter @Setter String description;
    private @Getter @Setter LocalDateTime date;
    private @Getter @Setter TaskType type;
    private @Getter @Setter TaskStatus status;

    public Task(int taskId, String title, String description, LocalDateTime date, TaskType type, TaskStatus status){
        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.date = date;
        this.type = type;
        this.status = status;
    }

    public Task(String title, String description, TaskType type){
        this.taskId = ++countId;
        this.title = title;
        this.description = description;
        this.date = LocalDateTime.now();
        this.type = type;
        this.status = TaskStatus.NEW;
    }

}
