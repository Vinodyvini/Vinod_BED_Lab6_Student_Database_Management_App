package com.greatlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.greatlearning")
public class CollageFestStudentManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollageFestStudentManagementSystemApplication.class, args);
	}

}
