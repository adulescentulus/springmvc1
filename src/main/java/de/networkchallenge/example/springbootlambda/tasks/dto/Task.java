package de.networkchallenge.example.springbootlambda.tasks.dto;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Task
{
    private String        title;
    private ZonedDateTime dateTime;
    private LocalDateTime dt;

    public Task(String title, ZonedDateTime dateTime, LocalDateTime dt)
    {
        this.title = title;
        this.dateTime = dateTime;
        this.dt = dt;
    }

    public ZonedDateTime getDateTime()
    {
        return dateTime;
    }

    public String getTitle()
    {
        return title;
    }

    public LocalDateTime getDt()
    {
        return dt;
    }
}
