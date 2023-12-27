package com.kn.service;

import java.util.List;

import com.kn.binding.Course;

public interface CourseService {
	
	public String upsert(Course course);
	
	public Course getbyid(Integer cid);
	
	public List<Course> getAllCourses();
	
	public String deleteById(Integer cid);
	
}
