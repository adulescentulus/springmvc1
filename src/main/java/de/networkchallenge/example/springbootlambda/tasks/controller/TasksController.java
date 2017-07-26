package de.networkchallenge.example.springbootlambda.tasks.controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import de.networkchallenge.example.springbootlambda.tasks.dto.Task;

@RestController
@EnableWebMvc
@CrossOrigin
@RequestMapping("/tasks")
public class TasksController
{
    @RequestMapping("/list")
    public List<Task> getTasks()
    {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("ksdnfns", ZonedDateTime.now(ZoneId.of("UTC")), LocalDateTime.now()));

        return tasks;
    }
}
