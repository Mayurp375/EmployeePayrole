package com.employeepayrole;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EmployeePayroleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeePayroleApplication.class, args);
		log.info("Employee Pay Role app is started");
	}

}
