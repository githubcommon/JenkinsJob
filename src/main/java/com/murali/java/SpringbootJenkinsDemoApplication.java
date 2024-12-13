package com.murali.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Sanapala Muralidharan
 * @date: 13 Dec 2024 6:24:24 pm
 * @version:3.x
 */
@SpringBootApplication
public class SpringbootJenkinsDemoApplication implements CommandLineRunner {

    public static final Logger logger = LoggerFactory.getLogger(SpringbootJenkinsDemoApplication.class);

    public static void main(String[] args) {
	logger.info("Its a continuous integration job... ");
	SpringApplication.run(SpringbootJenkinsDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
	logger.info("Its my second logger... ");

    }
}
