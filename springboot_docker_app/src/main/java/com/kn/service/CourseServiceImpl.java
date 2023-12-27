package com.kn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kn.binding.Course;
import com.kn.repo.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepo;
	
	
	@Override
	public String upsert(Course course) {
	
		courseRepo.save(course); //update or insert based in PK
		
		return "Success";
	}

	@Override
	public Course getbyid(Integer cid) {

		Optional<Course> findById = courseRepo.findById(cid);
		
		if(findById.isPresent()){//to avoid null pointer exception
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		return courseRepo.findAll();
	}

	@Override
	public String deleteById(Integer cid) {
		if(courseRepo.existsById(cid)) {
			courseRepo.deleteById(cid);
			return "Deleted Successfull";
		}else {
			return "No record Found";
		}
	}

}
