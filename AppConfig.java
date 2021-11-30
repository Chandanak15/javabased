package com.example.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({CollegeImpl.class})
public class AppConfig {

	@Bean
	public College college() {
		CollegeImpl college = new CollegeImpl();
		college.setTeacher(teacher());
		return college;
	}
   
	@Bean
	public Teacher teacher() {
		return new TeacherImpl();
	}
	
}