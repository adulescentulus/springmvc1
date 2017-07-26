package de.networkchallenge.example.springbootlambda.tasks.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootApplicationConfiguration.class, args);
    }

}
