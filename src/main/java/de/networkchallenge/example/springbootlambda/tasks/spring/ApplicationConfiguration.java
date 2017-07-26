package de.networkchallenge.example.springbootlambda.tasks.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import de.networkchallenge.example.springbootlambda.tasks.controller.TasksController;

@Configuration
@ComponentScan(basePackageClasses =
{ ApplicationConfiguration.class, TasksController.class })
public class ApplicationConfiguration
{}