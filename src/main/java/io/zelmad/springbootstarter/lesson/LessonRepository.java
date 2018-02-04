package io.zelmad.springbootstarter.lesson;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

interface LessonRepository extends CrudRepository<Lesson, String> {
	
	public List<Lesson> findByCourseId(String lessonId);
}
