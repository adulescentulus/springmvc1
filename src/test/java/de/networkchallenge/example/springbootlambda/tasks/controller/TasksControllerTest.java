package de.networkchallenge.example.springbootlambda.tasks.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import java.time.LocalDateTime;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class TasksControllerTest
{
    @Test
    public void whenSerializingJava8Date_thenCorrect()
            throws JsonProcessingException
    {
        LocalDateTime date = LocalDateTime.of(2014, 12, 20, 2, 30);

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        String result = mapper.writeValueAsString(date);
        assertThat(result, containsString("2014-12-20T02:30"));
    }
}