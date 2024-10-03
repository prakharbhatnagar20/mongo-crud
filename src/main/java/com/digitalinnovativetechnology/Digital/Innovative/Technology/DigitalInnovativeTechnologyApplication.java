package com.digitalinnovativetechnology.Digital.Innovative.Technology;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.digitalinnovativetechnology.Digital.Innovative.Technology.repository")
public class DigitalInnovativeTechnologyApplication {

	public static void main(String[] args) {

		SpringApplication.run(DigitalInnovativeTechnologyApplication.class, args);
	}

}
