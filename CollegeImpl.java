package com.example.javabased;

public class CollegeImpl implements College{
	
	private Teacher teacher;

	private String name;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void provideEducation() {
		// TODO Auto-generated method stub
		teacher.teach();
		
	}

	
	
	

}
