package io.zelmad.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

interface CourseRepository extends CrudRepository<Course, String> {
	
	public List<Course> findByTopicId(String courseId);
}
