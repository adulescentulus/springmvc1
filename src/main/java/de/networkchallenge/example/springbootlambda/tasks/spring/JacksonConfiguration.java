package de.networkchallenge.example.springbootlambda.tasks.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Configuration
public class JacksonConfiguration
{
    @Bean
    @Primary
    public ObjectMapper objectMapper()
    {
        System.out.println("###### MAPPPER INIT");
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule())
                .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        return mapper;
    }

}
