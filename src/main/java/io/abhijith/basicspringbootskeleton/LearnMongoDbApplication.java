package io.abhijith.basicspringbootskeleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("io.abhijith.basicspringbootskeleton.repository")
public class LearnMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnMongoDbApplication.class, args);
	}

}
