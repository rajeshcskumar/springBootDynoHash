package com.devtiro.postgre;
import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class PostgreApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgreApplication.class, args);
	}
}
