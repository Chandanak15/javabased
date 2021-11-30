package com.example.javabased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		College college =  context.getBean("college", College.class);
		CollegeImpl collegeImpl = new CollegeImpl();
		collegeImpl.setName("ABC");
		System.out.println("Welcome to "+collegeImpl.getName());
		college.provideEducation();
		
		context.close();
		
	}

}
