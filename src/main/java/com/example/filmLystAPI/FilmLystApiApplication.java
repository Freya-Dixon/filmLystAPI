package com.example.filmLystAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

@RestController
public class FilmLystApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmLystApiApplication.class, args);

	}

}
