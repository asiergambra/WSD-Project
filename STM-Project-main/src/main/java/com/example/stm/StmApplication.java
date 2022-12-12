package com.example.stm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import com.example.stm.model.*;

import java.time.LocalDateTime;
@Import(Task.class)
@SpringBootApplication
public class StmApplication {

    public static void main(String[] args) { SpringApplication.run(StmApplication.class, args);
        TaskRepository.users.forEach(System.out::println);
    }

}
