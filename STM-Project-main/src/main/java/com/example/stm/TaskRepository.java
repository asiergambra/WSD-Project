package com.example.stm;

import com.example.stm.model.*;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public interface TaskRepository{
    public List<Task> users = new ArrayList<>(
            Arrays.asList(
                    new Task(
                            1,
                            "task 1",
                            "...",
                            LocalDateTime.of(2021,1,1,10,10),
                            TaskType.TASK,
                            TaskStatus.NEW
                    ),
                    new Task(
                            2,
                            "task 2",
                            "...",
                            LocalDateTime.of(2021,2,14,9,10),
                            TaskType.BUG,
                            TaskStatus.IN_PROGRESS
                    ),
                    new Task(
                            3,
                            "task 3",
                            "...",
                            LocalDateTime.of(2020,3,12,10,10),
                            TaskType.FEATURE,
                            TaskStatus.DONE
                    )
            )
    );
}
