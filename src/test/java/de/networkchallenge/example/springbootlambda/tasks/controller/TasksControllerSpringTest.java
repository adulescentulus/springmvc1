package de.networkchallenge.example.springbootlambda.tasks.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import de.networkchallenge.example.springbootlambda.tasks.springboot.App;

@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class TasksControllerSpringTest
{
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception
    {
        this.mockMvc.perform(get("/tasks/list")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("2017-")));
    }
}