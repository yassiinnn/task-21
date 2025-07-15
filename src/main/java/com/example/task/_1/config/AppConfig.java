package com.example.task._1.config;

import com.example.task._1.service.FirstService;
import com.example.task._1.service.SecondService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope("singleton")  // default, but explicitly stated for learning
    public FirstService firstService() {
        return new FirstService();
    }

    @Bean
    @Scope("prototype")
    public SecondService secondService() {
        return new SecondService();
    }
}
