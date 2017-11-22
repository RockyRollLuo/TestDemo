package com.rocky.mvcdemo.service;

import org.springframework.stereotype.Service;

import com.rocky.mvcdemo.model.Course;

@Service
public interface CourseService {
	
	
	Course getCoursebyId(Integer courseId);
	

	
	

}
