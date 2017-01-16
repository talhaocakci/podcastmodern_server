package com.javathlon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.javathlon.controller")
public class PodcastmodernApplication {

	public static void main(String[] args) {
		SpringApplication.run(PodcastmodernApplication.class, args);
	}
}
