package com.example.task._1.consumer;

import com.example.task._1.service.FirstService;
import com.example.task._1.service.SecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceConsumer {

    private FirstService firstService;

    @Autowired // Constructor Injection
    public ServiceConsumer(FirstService firstService) {
        this.firstService = firstService;
    }

    private SecondService secondService;

    @Autowired // Setter Injection
    public void setSecondService(SecondService secondService) {
        this.secondService = secondService;
    }

    public void displayMessages() {
        System.out.println(firstService.getMessage());
        System.out.println(secondService.getMessage());
    }
}
