package de.networkchallenge.example.springbootlambda.tasks.springboot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import de.networkchallenge.example.springbootlambda.tasks.spring.ApplicationConfiguration;

@Configuration
@ComponentScan(basePackageClasses =
{ SpringBootApplicationConfiguration.class, ApplicationConfiguration.class })
public class SpringBootApplicationConfiguration
{}