package io.zelmad.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

interface TopicRepository extends CrudRepository<Topic, String> {
	
}
