package com.example.task._1;

import com.example.task._1.consumer.ServiceConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootdemoApplication implements CommandLineRunner {

	@Autowired
	private ServiceConsumer serviceConsumer;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		serviceConsumer.displayMessages();
	}
}
