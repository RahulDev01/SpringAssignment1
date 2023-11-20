package com.example.demo;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchooldataApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext ss = SpringApplication.run(StudentService.class, args);
		StudentService s = ss.getBean(StudentService.class);
		s.addNewStudentDetail(101, "Dev", 80);
		s.addNewStudentDetail(102, "Rahul", 92);
		s.addNewStudentDetail(103, "Rohit", 65);

		s.getAllStudentDetails();
		s.getStudentDetailsById(101);
		s.updateStudentScore(101,85);
		s.deleteStudentDetails(102);
		s.getAllStudentDetails();
	}

}
		


